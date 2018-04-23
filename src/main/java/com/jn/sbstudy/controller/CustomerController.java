package com.jn.sbstudy.controller;

import com.github.pagehelper.Page;
import com.jn.sbstudy.dataobject.Customer;
import com.jn.sbstudy.mapper.CustomerMapper;
import com.jn.sbstudy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @RequestMapping("/listAll")
    public List<Customer> ListAll() {
        List<Customer> list = service.GetAll();

        return list;
    }

//    @RequestMapping("/insert")
//    public int  insertrecord() {
//        return mapper.insert(1234567, "testfirst", "testlast");
//    }

    @RequestMapping("/getpage")
    public List<Customer> getpage() {

        Integer num = 2;
        Integer size = 50;

        Page<Customer> page = service.GetPage(num, size);

        List<Customer> list = new ArrayList<Customer>();

        for(Customer customer:page) {
            list.add(customer);
        }

        return list;
    }


}
