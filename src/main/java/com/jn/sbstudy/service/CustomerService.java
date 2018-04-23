package com.jn.sbstudy.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jn.sbstudy.dataobject.Customer;
import com.jn.sbstudy.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lee on 2018/4/23 15:39.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerMapper mapper;

    public List<Customer> GetAll() {
        return mapper.getAll();
    }

    public Page<Customer> GetPage(Integer pagenum, Integer pagesize) {
        PageHelper.startPage(pagenum, pagesize);

        return mapper.getPage();
    }
}
