package com.sensetime.ehr.emp.service.impl;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.sensetime.ehr.emp.common.base.BaseServiceImpl;
import com.sensetime.ehr.emp.entity.SysDictionary;
import com.sensetime.ehr.emp.service.SysDictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


/**
 * @author luoweiwen_vendor
 */
@Slf4j
@Service
public class SysDictionaryServiceImpl extends BaseServiceImpl<SysDictionary, Long> implements SysDictionaryService {

    @Override
    public String getByTypeAndKey(String type, String key) {
        if (!StringUtils.isEmpty(key)) {
            List<SysDictionary> sysDictionary = listByType(type).stream()
                    .filter(item -> item.getKey().equals(key)).collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(sysDictionary)) {
                if (sysDictionary.size() > 1) {
//                    log.info("1");
//                    log.error(new DictionaryException("字典错误[" + type + "]在根据key:" + key + "获取value时返回多个值").toString());
                } else {
                    return sysDictionary.get(0).getZhCn();
                }
            }
        }
        return null;
    }

    @Override
    public String getByTypeAndValue(String type, String value) {
        return null;
    }

    @Override
    public List<String> listType() {
        return null;
    }

    @Override
    public List<SysDictionary> listByType(String type) {
        return null;
    }

    @Override
    public void updateDictionaryCache(List<String> typeList) {

    }

    /**
     * 本地缓存
     */
    private static Cache<String, List<SysDictionary>> localCache = CacheBuilder.newBuilder()
            .maximumSize(128)
            .expireAfterWrite(1, TimeUnit.HOURS)
            .build();
}
