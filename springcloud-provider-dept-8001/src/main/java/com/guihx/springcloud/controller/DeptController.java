package com.guihx.springcloud.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guihx.springcloud.pojo.Dept;
import com.guihx.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cloud/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping("/getAll")
    public List<Dept> getAll() {
        return deptService.list();
    }

    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable("id") Long id) {
        return deptService.getById(id);
    }

    @GetMapping("/get2/{id}")
    public Dept getById(@PathVariable("id") Long id, @RequestParam("name") String name, HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return deptService.getOne(new QueryWrapper<Dept>().lambda().eq(Dept::getId, id).like(Dept::getName, name));
    }

}
