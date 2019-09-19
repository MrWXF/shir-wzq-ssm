package com.wzq.ssm.model;


public class Staff {

    private Integer id;

    /**
     * 职工名称
     */
    private String name;

    /**
     * 职工职称
     */
    private String title;

    /**
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String adress;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态（1，在职，0，离职）
     */
    private Integer state;

    /**
     * 状态字符串
     */
    private String stateStr;

    public String getStateStr() {
        return stateStr;
    }

    public void setStateStr(String stateStr) {
        if("在职".equals(stateStr)){
            this.state = 1;
        }
        else if("离职".equals(stateStr)){
            this.state = 0;
        }
        this.stateStr = stateStr;
    }

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
     * 获取职工名称
     *
     * @return name - 职工名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置职工名称
     *
     * @param name 职工名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取职工职称
     *
     * @return title - 职工职称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置职工职称
     *
     * @param title 职工职称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取地址
     *
     * @return adress - 地址
     */
    public String getAdress() {
        return adress;
    }

    /**
     * 设置地址
     *
     * @param adress 地址
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取状态（1，在职，0，离职）
     *
     * @return state - 状态（1，在职，0，离职）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态（1，在职，0，离职）
     *
     * @param state 状态（1，在职，0，离职）
     */
    public void setState(Integer state) {
        if (state.equals(1)){
            this.stateStr = "在职";
        }
        else if(state.equals(0)){
            this.stateStr = "离职";
        }
        this.state = state;
    }
}