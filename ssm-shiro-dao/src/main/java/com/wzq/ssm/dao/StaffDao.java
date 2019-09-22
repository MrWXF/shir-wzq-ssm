package com.wzq.ssm.dao;

import com.wzq.ssm.model.Staff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StaffDao {

    @Select("select * from tb_staff")
    List<Staff> findAll();

    //insert into tb_staff(name,title,phone ,adress ,email,state ) values (
    //            '王小飞','超市店长','123859845','中国首都','12221@qq.cok',1)

    @Insert("insert into tb_staff(name,title,phone ,adress ,email,state ) values (#{name},#{title},#{phone},#{adress},#{email},#{state})")
    int addStaff(Staff staff);
}
