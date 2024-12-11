package com.ice_cola.controller;

import com.ice_cola.pojo.po.TestPO;
import com.ice_cola.service.ITestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ice_cola
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private ITestService testService;

    @GetMapping("/hello")
    public String test() {
        return "hello";
    }

    @GetMapping("/queryAll")
    public List<TestPO> queryAll()    {
        return testService.selectAll();
    }

}
