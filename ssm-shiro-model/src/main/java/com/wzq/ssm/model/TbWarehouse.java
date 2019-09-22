package com.wzq.ssm.model;

import java.util.Date;


public class TbWarehouse {
    private Integer id;

    /**
     * 登记单号
     */
    private String odd;

    /**
     * 商品信息
     */
    private String commodity;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 入库日期
     */
    private Date storedate;

    /**
     * 仓库号
     */
    private Integer storeid;

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
     * 获取登记单号
     *
     * @return odd - 登记单号
     */
    public String getOdd() {
        return odd;
    }

    /**
     * 设置登记单号
     *
     * @param odd 登记单号
     */
    public void setOdd(String odd) {
        this.odd = odd;
    }

    /**
     * 获取商品信息
     *
     * @return commodity - 商品信息
     */
    public String getCommodity() {
        return commodity;
    }

    /**
     * 设置商品信息
     *
     * @param commodity 商品信息
     */
    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    /**
     * 获取数量
     *
     * @return number - 数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置数量
     *
     * @param number 数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取入库日期
     *
     * @return storedate - 入库日期
     */
    public Date getStoredate() {
        return storedate;
    }

    /**
     * 设置入库日期
     *
     * @param storedate 入库日期
     */
    public void setStoredate(Date storedate) {
        this.storedate = storedate;
    }

    /**
     * 获取仓库号
     *
     * @return storeid - 仓库号
     */
    public Integer getStoreid() {
        return storeid;
    }

    /**
     * 设置仓库号
     *
     * @param storeid 仓库号
     */
    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }
}