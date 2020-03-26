package com.sensetime.ehr.emp.common.web;

/**
 * Response 结果状态，成功/失败
 *
 * @author zhengbing_vendor
 */
public interface RspStatus {

    public static class Result {
        public static final String SUCCESS = "success";
        public static final String FAIL = "fail";
    }

    public static class StatusCode {
        public static final String SUCCESS = "success";
        public static final String FAIL = "fail";
    }

    public static class Message {

    }

}
