package com.sensetime.ehr.emp.common.web;

import java.io.Serializable;
import java.util.List;


public class PageDataList<T> extends PageInfoCommon implements Serializable {
    private static final long serialVersionUID = 1774508674048875204L;
    private Long totalSize;
    private List<T> data;

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }


    public static <T> PageDataListBuilder<T> builder() {
        return new PageDataListBuilder<>();
    }

    public static class PageDataListBuilder<T> {
        private Long totalSize;
        private List<T> data;
        private int curPage;
        private int pageSize;

        public PageDataListBuilder totalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }


        public PageDataListBuilder data(List<T> data) {
            this.data = data;
            return this;
        }


        public PageDataListBuilder curPage(int curPage) {
            this.curPage = curPage;
            return this;
        }


        public PageDataListBuilder pageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public PageDataList<T> build() {
            PageDataList<T> object = new PageDataList<>();
            object.setPageSize(this.pageSize);
            object.setTotalSize(this.totalSize);
            object.setCurPage(this.curPage);
            object.setData(this.data);
            return object;
        }
    }

}
