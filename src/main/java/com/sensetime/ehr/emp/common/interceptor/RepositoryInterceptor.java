package com.sensetime.ehr.emp.common.interceptor;

import com.sensetime.ehr.emp.common.utils.ReflectHelper;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/***
 *
 * @Description: 持久化拦截器
 * @author: 张正泉  623109458@qq.com
 * @date: 2017/11/6 16:23
 * @version: V1.0
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class RepositoryInterceptor implements Interceptor {

    private static final Logger logger = LoggerFactory.getLogger(RepositoryInterceptor.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        if (args.length > 1) {
            MappedStatement ms = (MappedStatement) args[0];
            Object parameter = args[1];
            Field[] fields = parameter.getClass().getDeclaredFields();
            switch (ms.getSqlCommandType()) {
                case INSERT:
                    insert(fields, parameter);
                    break;
                case UPDATE:
                    update(fields, parameter);
                    break;
                default:
                    break;
            }
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

    private void insertSingle(Field[] fields, Object parameter) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (Field field : fields) {
            String fieldName = field.getName();
            if (ReflectHelper.getFieldValue(parameter, fieldName) == null) {
                if ("delFlag".equals(fieldName) || "createDate".equals(fieldName) || "updateDate".equals(fieldName)) {
                    setDefault(field, parameter);
                }
            }
        }
    }

    private void insert(Field[] fields, Object parameter) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (parameter instanceof MapperMethod.ParamMap) {
            MapperMethod.ParamMap<Object> paramMap = (MapperMethod.ParamMap<Object>) parameter;
            if (paramMap.size() == 2 && paramMap.containsKey("list") && paramMap.containsKey("param1")) {
                if (paramMap.get("param1") instanceof List) {
                    List<Object> dataList = (List<Object>) paramMap.get("param1");
                    for (Object o : dataList) {
                        insertSingle(o.getClass().getDeclaredFields(), o);
                    }
                }
            } else {
                insertSingle(fields, parameter);
            }
        } else {
            insertSingle(fields, parameter);
        }
    }

    private static final String UPDATE_FLAG_FIELD = "update_date";

    private void updateSingle(Field[] fields, Object parameter) {
        for (Field field : fields) {
            String fieldName = field.getName();
            if ("updateDate".equals(fieldName)) {
                setDefault(field, parameter);
            }
        }
    }

    private void update(Field[] fields, Object parameter) {
        if (parameter instanceof MapperMethod.ParamMap) {
            MapperMethod.ParamMap<Object> paramMap = (MapperMethod.ParamMap<Object>) parameter;
            if (paramMap.size() == 2 && paramMap.containsKey("list") && paramMap.containsKey("param1")) {
                if (paramMap.get("param1") instanceof List) {
                    List<Object> dataList = (List<Object>) paramMap.get("param1");
                    for (Object o : dataList) {
                        updateSingle(o.getClass().getDeclaredFields(), o);
                    }
                }
            } else {
                updateSingle(fields, parameter);
            }
        } else {
            updateSingle(fields, parameter);
        }
    }

    private void setDefault(Field field, Object parameter) {
        String fieldName = field.getName();
        switch (field.getType().getTypeName()) {
            case "java.lang.Boolean":
                ReflectHelper.setFieldValue(parameter, fieldName, false);
                break;
            case "java.lang.Double":
                ReflectHelper.setFieldValue(parameter, fieldName, 0d);
                break;
            case "java.lang.Float":
                ReflectHelper.setFieldValue(parameter, fieldName, 0f);
                break;
            case "java.lang.Integer":
                ReflectHelper.setFieldValue(parameter, fieldName, 0);
                break;
            case "java.lang.Long":
                ReflectHelper.setFieldValue(parameter, fieldName, 0L);
                break;
            case "java.util.Date":
                ReflectHelper.setFieldValue(parameter, fieldName, new Date());
                break;
            case "java.math.BigDecimal":
                ReflectHelper.setFieldValue(parameter, fieldName, new BigDecimal(0));
                break;
            case "java.lang.Byte":
                byte tmp = 0x0;
                ReflectHelper.setFieldValue(parameter, fieldName, tmp);
                break;
            case "java.lang.Short":
                ReflectHelper.setFieldValue(parameter, fieldName, (short) 0);
                break;
            default:
                break;
        }
    }
}
