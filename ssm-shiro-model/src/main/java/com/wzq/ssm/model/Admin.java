package com.wzq.ssm.model;


public class Admin {
    /**
     * id
     */

    private Integer id;

    /**
     * 管理名称
     */
    private String name;

    private String password;

    /**
     * 角色等级(1，总管理员 2，员工管理员，3仓库管理员)
     */
    private Integer role;


    public Admin() {
    }

    public Admin(String name, String password, Integer role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取管理名称
     *
     * @return name - 管理名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置管理名称
     *
     * @param name 管理名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取角色等级(1，总管理员 2，员工管理员，3仓库管理员)
     *
     * @return role - 角色等级(1，总管理员 2，员工管理员，3仓库管理员)
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置角色等级(1，总管理员 2，员工管理员，3仓库管理员)
     *
     * @param role 角色等级(1，总管理员 2，员工管理员，3仓库管理员)
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}