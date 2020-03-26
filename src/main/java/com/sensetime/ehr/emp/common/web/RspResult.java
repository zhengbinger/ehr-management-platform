package com.sensetime.ehr.emp.common.web;

import java.io.Serializable;

/**
 * 通用 Response 结果封装
 *
 * @param <T>
 * @author zhengbing_vendor
 */
public class RspResult<T> extends RspResultBase<T> implements Serializable {

    private static final long serialVersionUID = 7047687062445535530L;

    public static <T> RspResultBuilder<T> builder() {
        return new RspResultBuilder<>();
    }

    public RspResult() {

    }

    public RspResult(String result, T detail, String errMsg) {
        super();
        setDetail(detail);
        setResult(result);
        setErrMsg(errMsg);
    }

    public RspResult(String result, T detail) {
        super();
        setDetail(detail);
        setResult(result);
    }

    public static class RspResultBuilder<T> {
        private String result;
        private T detail;

        public RspResultBuilder<T> result(String result) {
            this.result = result;
            return this;
        }


        public RspResultBuilder<T> detail(T detail) {
            this.detail = detail;
            return this;
        }


        public RspResultBase<T> build() {
            RspResult<T> object = new RspResult<>();
            object.setDetail(this.detail);
            object.setResult(this.result);
            return object;
        }
    }
}
