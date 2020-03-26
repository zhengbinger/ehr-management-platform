package com.sensetime.ehr.emp.common.exception;


/**
 * 使用字典异常
 *
 * @author zhangzhengquan
 */
public class DictionaryException extends Exception {
    private static final long serialVersionUID = 2762254969638705941L;
    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public DictionaryException(String message) {
        super(message);
        this.errorCode = "DictionaryException";
    }

    @Override
    public String toString() {
        return "{\"errorCode\":\"" + this.errorCode + "\",\"message\":\"" + this.getMessage() + "\"}";
    }
}
