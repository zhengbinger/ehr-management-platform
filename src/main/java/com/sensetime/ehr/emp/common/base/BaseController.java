package com.sensetime.ehr.emp.common.base;

import com.sensetime.ehr.emp.common.web.PageRspResult;
import com.sensetime.ehr.emp.common.web.RspResult;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

/**
 * Controller 抽象接口
 *
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
public interface BaseController<T, PK> {

    /**
     * 分页查询接口
     *
     * @param t        T
     * @param pageable Pageable
     * @return PageRspResult<T>
     */
    @GetMapping("pages")
    PageRspResult<T> list(@RequestBody T t, @PageableDefault(direction = Sort.Direction.DESC) Pageable pageable);

    /**
     * 根据主键查询
     *
     * @param id SerializableKey
     * @return RspResult<T>
     */
    @GetMapping("{id}")
    RspResult<T> findById(@PathVariable PK id);

    /**
     * 新增接口
     *
     * @param t SerializableKey
     * @return RspResult<T>
     */
    @PostMapping()
    RspResult<T> save(@RequestBody T t);

    /**
     * 根据主键删除接口
     *
     * @param id SerializableKey
     * @return RspResult<T>
     */
    @DeleteMapping(value = "{id}")
    RspResult<Boolean> deleteByKey(@PathVariable PK id);

    /**
     * 修改接口
     *
     * @param t T
     * @return RspResult<T>
     */
    @RequestMapping(method = {RequestMethod.OPTIONS})
    RspResult<T> modify(@RequestBody T t);
}
