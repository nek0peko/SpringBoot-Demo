package com.example.demo.dto.data;

import com.example.demo.exception.ErrorCodeI;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * BusinessErrorEnum
 *
 * @author nek0peko
 * @date 2022/12/13
 */
@Getter
@AllArgsConstructor
public enum BusinessErrorEnum implements ErrorCodeI {

    B_DEMO_ERROR("B_DEMO_ERROR", "DEMO ERROR"),
    ;

    private final String errCode;

    private final String errMessage;

}
