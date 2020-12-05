package com.test.demo.sample.controller;

import java.util.ArrayList;
import java.util.List;

import com.test.demo.god.bo.test.service.TestService;
import com.test.demo.god.bo.test.vo.TestVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
    
    @GetMapping("/home")
    public String home() {
        return "index.html";
    }

    @ResponseBody
    @GetMapping("/showString")
    public String bodyTest() {
        return "string입니당";
    }

    @GetMapping("/testJina")
    public String testJina() throws Exception {
        return "test";
    }

    @GetMapping("/test")
    public ModelAndView test() throws Exception {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "jina");

        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");

        mav.addObject("list", testList);
        return mav;
    }

    @Autowired
    TestService testService;

    @GetMapping("/voTest")
    public ModelAndView voTest() throws Exception {
        ModelAndView mav = new ModelAndView("voTest");

        List<TestVo> testList = testService.selectTestG();
        mav.addObject("list", testList);

        return mav;
    }
}