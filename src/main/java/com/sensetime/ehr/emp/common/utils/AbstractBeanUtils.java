package com.sensetime.ehr.emp.common.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengbing_vendor
 */
public abstract class AbstractBeanUtils extends BeanUtils {

    public static <S, T> void copyProperties(List<S> sources, List<T> targets) throws BeansException {
        for (int i = 0; i < sources.size(); i++) {
            S source = sources.get(i);
            T target = targets.get(i);
            BeanUtils.copyProperties(source, target);
        }
    }

    public static <S, T> List<T> copyProperties(List<S> sources, Class<T> clazz) throws BeansException, IllegalAccessException, InstantiationException {
        List<T> targets = new ArrayList<>();
        for (S source : sources) {
            T target = clazz.newInstance();
            BeanUtils.copyProperties(source, target);
            targets.add(target);
        }
        return targets;
    }
}
