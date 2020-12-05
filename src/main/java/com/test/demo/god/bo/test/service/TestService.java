package com.test.demo.god.bo.test.service;

import java.util.List;

import com.test.demo.god.bo.test.mapper.TestMapper;
import com.test.demo.god.bo.test.vo.TestVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    
    @Autowired
    public TestMapper mapper;

    public List<TestVo> selectTestG() {
        return mapper.selectTest();
    }
}
