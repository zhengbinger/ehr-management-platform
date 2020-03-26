package com.sensetime.ehr.emp.common.web;

/**
 * 统一ResponseResult基类
 *
 * @param <T>
 * @author zhengbing_vendor
 */
public class RspResultBase<T> {
    private String result = RspStatus.Result.SUCCESS;
    private T detail;
    private String errMsg;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }


    public void setError(String msg) {
        this.setResult(RspStatus.Result.FAIL);
        this.setErrMsg(msg);
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
