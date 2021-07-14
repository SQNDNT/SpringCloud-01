package springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guihx.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;
import springcloud.mapper.DeptMapper;
import springcloud.service.DeptService;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {
}
