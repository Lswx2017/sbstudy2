package com.jn.sbstudy.mapper;

import com.github.pagehelper.Page;
import com.jn.sbstudy.dataobject.Customer;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerMapper {

    @Select("SELECT * FROM customer order by id")
    List<Customer> getAll();

    @Select("SELECT * FROM customer")
    Page<Customer> getPage();

    @Insert("insert into customer(id,firstname,lastname) values(#{id}, #{firstname} , #{lastname})")
    int insert(@Param("id") int id,@Param("firstname") String firstname, @Param("lastname") String lastname  );
}
