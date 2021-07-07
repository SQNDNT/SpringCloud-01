package com.guihx.springcloud.controller;

import com.guihx.springcloud.pojo.Dept;
import com.guihx.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cloud/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping("/getAll")
    public List<Dept> getAll() {
        return deptService.list();
    }


}
