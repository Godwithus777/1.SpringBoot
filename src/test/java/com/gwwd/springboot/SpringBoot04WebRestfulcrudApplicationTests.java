package com.gwwd.springboot;

//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@SpringBootTest
public class SpringBoot04WebRestfulcrudApplicationTests {

    @Test
    public void contextLoads() {
        List<String> strings = Arrays.asList("zhangsan", "lisi", "wangwu");
        Collection list = new ArrayList();
        list.add("zhangsna");
        list.add("zhangsna");
        list.add("zhangsna");
        System.out.println(strings);
        System.out.println(list);
    }

}

