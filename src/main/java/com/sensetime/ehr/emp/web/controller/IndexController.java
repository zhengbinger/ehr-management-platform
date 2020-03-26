package com.sensetime.ehr.emp.web.controller;

import com.sensetime.ehr.emp.common.web.RspResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 首页Controller
 *
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
@RestController
@Api(value = "", tags = "登录成功后跳转首页接口，对首页需要的数据进行包装")
public class IndexController {

    /**
     * 登录成功之后的进行首页数据的处理，
     *
     * @return RspResult<String>
     */
    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public RspResult<String> index(HttpServletRequest request) {
        RspResult<String> result = new RspResult<>();
        String username = request.getParameter("username");
        result.setDetail(username);
        return result;
    }
}
