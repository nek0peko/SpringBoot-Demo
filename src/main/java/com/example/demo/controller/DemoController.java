package com.example.demo.controller;

import com.example.demo.dto.data.DemoDTO;
import com.example.demo.dto.response.SingleResponse;
import com.example.demo.service.DemoService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * DemoController
 *
 * @author nek0peko
 * @date 2023/03/31
 */
@RestController
@RequestMapping("demo")
@Validated
public class DemoController {

    @Resource
    private transient DemoService service;

    @PostMapping(value = "/test")
    public SingleResponse<DemoDTO> create(@Valid @NotNull @RequestBody(required = false) Object obj) {
        return service.test(obj);
    }

}
