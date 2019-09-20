package com.wzq.ssm.dao;

import org.apache.ibatis.annotations.Select;

public interface RoleDao {

    /**
     * 根据外键查询角色信息
     * @return
     * sql : select a.*,r.* from tb_admin a, tb_role r WHERE a.role = r.a_role
     */

    @Select("select b.roleName from tb_admin a,tb_role r where = r.a_role=#{role}")
    public String roleName(Integer role);
}
