package com.app.test.service;

import java.util.List;

/**
 * Created by zhangmm on 2016-03-10.
 */
public interface PersonService {
    List<Person> callPerson(String name, Integer num);
}
