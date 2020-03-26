package com.sensetime.ehr.emp.service;

import com.sensetime.ehr.emp.common.base.BaseService;
import com.sensetime.ehr.emp.entity.SysDictionary;

import java.util.List;

/**
 * 字典服务接口
 *
 * @author zhengbing_vendor
 */
public interface SysDictionaryService extends BaseService<SysDictionary, Long> {

    /**
     * 根据类型和值查找唯一数据字典
     *
     * @param type DictionaryTypeEnum
     * @param key  String
     * @return SysDictionary
     */
    String getByTypeAndKey(String type, String key);


    /**
     * 根据类型和值查找唯一数据字典
     *
     * @param type  DictionaryTypeEnum
     * @param value String
     * @return SysDictionary
     */
    String getByTypeAndValue(String type, String value);

    /**
     * 查询所有的类型。去重
     *
     * @return
     */
    List<String> listType();

    /**
     * 根据类型查询数据字典
     *
     * @param type String
     * @return
     */
    List<SysDictionary> listByType(String type);

    /**
     * 更新字典数据
     *
     * @param typeList
     */
    void updateDictionaryCache(List<String> typeList);
}
