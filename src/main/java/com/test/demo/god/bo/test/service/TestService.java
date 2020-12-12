package com.test.demo.god.bo.test.service;

import java.util.List;

import com.test.demo.god.bo.test.mapper.TestMapper;
import com.test.demo.god.bo.test.vo.TestVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    
    @Autowired
    public TestMapper mapper;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<TestVo> selectTestG() {

        logger.trace("Trace Level 테스트");
        logger.debug("DEBUG Level 테스트");
        logger.info("INFO Level 테스트");
        logger.warn("Warn Level 테스트");
        logger.error("ERROR Level 테스트");

        return mapper.selectTest();
    }
}
