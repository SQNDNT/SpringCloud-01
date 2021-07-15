package com.guihx.springcloud.service;

import com.guihx.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBack.class)
public interface DeptClientService {
    @GetMapping("/cloud/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id);

    @RequestMapping("/cloud/dept/getAll")
    public List<Dept> getAll();

    @GetMapping("/cloud/dept/get2/{id}")
    public Dept getById(@PathVariable("id") Long id, @RequestParam("name") String name);
}
