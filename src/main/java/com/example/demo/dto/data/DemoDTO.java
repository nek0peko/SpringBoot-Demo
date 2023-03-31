package com.example.demo.dto.data;

import com.example.demo.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * DemoDTO
 *
 * @author nek0peko
 * @date 2022/12/12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DemoDTO extends BaseDTO {

    private Object demoObj;

}
