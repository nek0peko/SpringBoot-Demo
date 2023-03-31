package com.example.demo.service;

import com.example.demo.dto.data.BusinessErrorEnum;
import com.example.demo.dto.data.DemoDTO;
import com.example.demo.dto.response.SingleResponse;
import com.example.demo.exception.BusinessException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * DemoService
 *
 * @author nek0peko
 * @date 2023/03/31
 */
@Service
public class DemoService {

    public SingleResponse test(Object obj) {
        if (Objects.isNull(obj)) {
            throw new BusinessException(BusinessErrorEnum.B_DEMO_ERROR);
        }
        return SingleResponse.of(new DemoDTO());
    }

}
