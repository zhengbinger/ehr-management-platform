package com.sensetime.ehr.emp.common.web;

import java.io.Serializable;

public class PageRspResult<T> extends RspResultBase<PageDataList<T>> implements Serializable {
    private static final long serialVersionUID = 8879803118948818045L;

    public static <T> PageRspResultBuilder<T> builder() {
        return new PageRspResultBuilder<>();
    }

    public static class PageRspResultBuilder<T> {
        private String result;
        private PageDataList<T> detail;

        public PageRspResultBuilder<T> result(String result) {
            this.result = result;
            return this;
        }


        public PageRspResultBuilder<T> detail(PageDataList<T> detail) {
            this.detail = detail;
            return this;
        }


        public PageRspResult<T> build() {
            PageRspResult<T> object = new PageRspResult<>();
            object.setDetail(this.detail);
            object.setResult(this.result);
            return object;
        }
    }
}
