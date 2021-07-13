package springcloud.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guihx.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper extends BaseMapper<Dept> {
}
