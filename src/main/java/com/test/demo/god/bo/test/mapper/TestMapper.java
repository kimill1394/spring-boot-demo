package com.test.demo.god.bo.test.mapper;

import java.util.List;

import com.test.demo.god.bo.test.vo.TestVo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<TestVo> selectTest();
}
