package com.wzq.ssm.dao;

import com.wzq.ssm.model.Staff;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StaffDao {

    @Select("select * from tb_staff")
    List<Staff> findAll();
}
