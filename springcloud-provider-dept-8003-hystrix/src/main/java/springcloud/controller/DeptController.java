package springcloud.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guihx.springcloud.pojo.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springcloud.service.DeptService;

import javax.servlet.http.HttpServletRequest;
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

    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "getByIdHystrix")
    public Dept getById(@PathVariable("id") Long id) {
        Dept byId = deptService.getById(id);
        if(byId == null){
            throw new RuntimeException("kong");
        }
        return byId;
    }

    public Dept getByIdHystrix(@PathVariable("id") Long id) {
        Dept dept = new Dept().setId(0L).setName("不存在").setDbSource("不存在");
        return dept;
    }

    @GetMapping("/get2/{id}")
    public Dept getById(@PathVariable("id") Long id, @RequestParam("name") String name, HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return deptService.getOne(new QueryWrapper<Dept>().lambda().eq(Dept::getId, id).like(Dept::getName, name));
    }

}
