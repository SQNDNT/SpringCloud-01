package com.guihx.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guihx.springcloud.mapper.DeptMapper;
import com.guihx.springcloud.pojo.Dept;
import com.guihx.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {
}
