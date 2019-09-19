package com.wzq.ssm.dao;

import com.wzq.ssm.model.Admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AdminDao {

    //查询
    @Select("select * from tb_admin")
    List<Admin> findAll();

    //更新
    @Update("update tb_admin set " +
            "name=#{name},password=#{password},role=#{role} where id=#{id} ")
    int update(Admin admin);

    //保存
    @Insert("insert into tb_admin(" +
            "name,password,role) " +
            "values(" +
            "#{name},#{password},#{role})")
    int sava(Admin admin);

    //删除
    @Delete("delete from tb_admin where id = #{id}")
    int delete(Integer id);

    @Select("select * from tb_admin where name = #{name}")
    Admin login(String name);
}
