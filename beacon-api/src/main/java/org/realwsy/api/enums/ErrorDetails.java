package org.realwsy.api.enums;

import lombok.Getter;

@Getter
public enum ErrorDetails {

    PARAMETER_ERROR(-10, "参数不合法");

    private Integer code;
    private String message;

    ErrorDetails(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
