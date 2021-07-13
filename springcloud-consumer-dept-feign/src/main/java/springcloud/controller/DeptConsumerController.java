package springcloud.controller;

import com.guihx.springcloud.pojo.Dept;
import com.guihx.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumer/dept")
public class DeptConsumerController {

    @Autowired
    DeptClientService deptClientService = null;

    @GetMapping("/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        return deptClientService.getById(id);
    }

    @RequestMapping("/getAll")
    public List<Dept> getAll() {
        return deptClientService.getAll();
    }

    @GetMapping("/get2/{id}")
    public Dept getById(@PathVariable("id") Long id, @RequestParam("name") String name){
        return  deptClientService.getById(id, name);
    }
}
