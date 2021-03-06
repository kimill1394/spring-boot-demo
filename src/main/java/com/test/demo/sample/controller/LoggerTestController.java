package com.test.demo.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoggerTestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/logTest")
    public ModelAndView logTest() throws Exception{
        ModelAndView mav = new ModelAndView();

        logger.trace("Trace Level 테스트");
        logger.debug("DEBUG Level 테스트");
        logger.info("INFO Level 테스트");
        logger.warn("Warn Level 테스트");
        logger.error("ERROR Level 테스트");

        return mav;
    }
}
