package com.example.demo.dto.data;

import com.example.demo.exception.ErrorCodeI;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * SystemErrorEnum
 *
 * @author nek0peko
 * @date 2022/12/13
 */
@Getter
@AllArgsConstructor
public enum SystemErrorEnum implements ErrorCodeI {

    // 数据源名重复
    S_SERVER_ERROR("S_SERVER_ERROR", "系统繁忙"),

    // 参数错误
    B_PARAMETER_ERROR("B_PARAMETER_ERROR", "请求参数错误！"),

    ;

    private final String errCode;

    private final String errMessage;

}
