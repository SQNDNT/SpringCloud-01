package com.guihx.springcloud.controller;

import com.guihx.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/consumer/dept")
public class DeptConsumerController {
    /**
     * 消费者不应该有service
     * RestTemplate 供人调用即可，需要自己去注册
     * 核心参数（url,实体或者map,Class<T> responseType）
     *
     * @Author guihx
     * @Date 2021-7-8 8:49
     */
    @Autowired
    RestTemplate restTemplate;

    /**
     * private  static  String URL_PREFIX = "http://localhost:8080/";
     * 用ribbon做负载均衡时此处要做成变量，否则访问的其实是同一个客户端
     *
     * @Author guihx
     * @Date 2021-7-9 15:51
     */
    private  static  String URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        return  restTemplate.getForObject(URL_PREFIX+"/cloud/dept/get/{id}", Dept.class,id);
    }

    @RequestMapping("/getAll")
    public List<Dept> getAll() {
        return  restTemplate.getForObject(URL_PREFIX+"/cloud/dept/getAll", List.class);
    }

    @GetMapping("/get2/{id}")
    public Dept getById(@PathVariable("id") Long id, @RequestParam("name") String name){
        Map<String,Object> map = new HashMap();
        map.put("id", id);
        map.put("name", name);
        return  restTemplate.getForObject(URL_PREFIX+"/cloud/dept/get2/{id}?name={name}", Dept.class,map);
    }
}
