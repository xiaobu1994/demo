package com.xiaobu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaobu.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 小布
 * @version 1.0.0
 * @className PersonMapper.java
 * @createTime 2022年06月02日 23:08:00
 */

@Mapper
public interface PersonMapper extends BaseMapper<Person> {
    int insertList(@Param("list") List<Person> list);


}