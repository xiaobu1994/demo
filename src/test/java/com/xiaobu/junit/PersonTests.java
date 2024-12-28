package com.xiaobu.junit;

import cn.hutool.core.util.IdcardUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.xiaobu.entity.Person;
import com.xiaobu.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PersonTests {

    @Resource
    private PersonService personService;


    @Test
    public void writeData() {
        ExcelReader reader = ExcelUtil.getReader("d:/out.xlsx");
        List<List<Object>> readAll = reader.read();
        List<List<Object>> all = readAll.subList(1, readAll.size());
        List<Person> list = new ArrayList<>();
        for (List<Object> objects : all) {
            Person person = new Person();
            String id = (String) objects.get(0);
            String name = (String) objects.get(1);
            Short month = IdcardUtil.getMonthByIdCard(id);
            person.setMonth(Integer.valueOf(month));
            person.setId(id);
            person.setName(name);
            list.add(person);
        }
        try {
            personService.insertList(list);
        } catch (Exception e) {
            log.error("[writeData]::e.getMessage() ==> [{}]", e.getMessage());
        }
        System.out.println("list.size() = " + list.size());
    }

    @Test
    public void writeDataFor() {
        String path = "D:\\export";
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File f : files) {
                String name = f.getName();
                if (name.endsWith(".xlsx")) {
                    ExcelReader reader = ExcelUtil.getReader(f.getAbsolutePath());
                    reader.addHeaderAlias("NAME", "name");
                    reader.addHeaderAlias("ID", "id");
                    reader.addHeaderAlias("MONTH", "month");
                    List<Person> all = reader.readAll(Person.class);
                    Set<Person> set = new HashSet<>();
                    for (Person idCard : all) {
                        String id = idCard.getId();
                        Person person = personService.selectById(id);
                        if (person == null) {
                            Short month = IdcardUtil.getMonthByIdCard(id);
                            idCard.setMonth(Integer.valueOf(month));
                            set.add(idCard);
                        }
                    }
                    if (set.size() > 0) {
                        List<Person> data = new ArrayList<>(set);
                        try {
                            personService.insertList(data);
                        } catch (Exception e) {
                            log.error("[writeData]::e.getMessage() ==> [{}]", e.getMessage());
                        }
                    }
                }
            }
        }
    }


}
