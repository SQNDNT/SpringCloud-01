package com.guihx.springcloud.service;

import com.guihx.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallBack implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        DeptClientService deptClientService = new DeptClientService() {
            @Override
            public Dept getById(Long id) {
                return new Dept().setId(0L).setName("服务降级").setDbSource("服务降级");
            }

            @Override
            public List<Dept> getAll() {
                return null;
            }

            @Override
            public Dept getById(Long id, String name) {
                return null;
            }
        };
        return deptClientService;
    }
}
