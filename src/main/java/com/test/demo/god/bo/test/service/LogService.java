// package com.test.demo.god.bo.test.service;

// import com.test.demo.god.bo.test.mapper.TestMapper;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class LogService {
//     private final Logger logger = LoggerFactory.getLogger(this.getClass());

//     @Autowired
//     public TestMapper mapper;

//     public List<TestVo> selectTest() {
        
//         logger.trace("Trace Level 테스트");
//         logger.debug("DEBUG Level 테스트");
//         logger.info("INFO Level 테스트");
//         logger.warn("Warn Level 테스트");
//         logger.error("ERROR Level 테스트");

//         return mapper.selectTest();
//     }
// }
