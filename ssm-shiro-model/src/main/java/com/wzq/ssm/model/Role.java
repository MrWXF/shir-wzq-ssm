package com.wzq.ssm.model;


public class Role {

    private Integer id;

    /**
     * 角色名
     */

    private String rolename;

    /**
     * 外键
     */

    private Integer aRole;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色名
     *
     * @return roleName - 角色名
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 设置角色名
     *
     * @param rolename 角色名
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * 获取外键
     *
     * @return a_role - 外键
     */
    public Integer getaRole() {
        return aRole;
    }

    /**
     * 设置外键
     *
     * @param aRole 外键
     */
    public void setaRole(Integer aRole) {
        this.aRole = aRole;
    }
}