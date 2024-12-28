package com.xiaobu.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaobu.entity.Person;
import com.xiaobu.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小布
 * @version 1.0.0
 * @className PersonService.java
 * @createTime 2022年06月02日 23:08:00
 */

@Service
public class PersonService extends ServiceImpl<PersonMapper, Person> {

    @Resource
    private PersonMapper personMapper;

    public void insertList(List<Person> personList) {
        personMapper.insertList(personList);
    }

    public Person selectById(String id) {
        return personMapper.selectById(id);
    }

}
