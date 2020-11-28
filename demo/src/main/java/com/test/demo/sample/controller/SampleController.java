package com.test.demo.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RestController
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
}