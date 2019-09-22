package com.wzq.ssm.model;

import java.util.Date;



public class TbStock {
    /**
     * 库存单号
     */
    private Integer stockid;

    /**
     * 商品信息
     */
    private String commodity;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 入库时间
     */
    private Date censusDate;

    /**
     * 统计人员
     */
    private String censusPro;

    /**
     * 仓库号
     */
    private Integer storeid;

    /**
     * 获取库存单号
     *
     * @return stockid - 库存单号
     */
    public Integer getStockid() {
        return stockid;
    }

    /**
     * 设置库存单号
     *
     * @param stockid 库存单号
     */
    public void setStockid(Integer stockid) {
        this.stockid = stockid;
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
     * 获取入库时间
     *
     * @return census_date - 入库时间
     */
    public Date getCensusDate() {
        return censusDate;
    }

    /**
     * 设置入库时间
     *
     * @param censusDate 入库时间
     */
    public void setCensusDate(Date censusDate) {
        this.censusDate = censusDate;
    }

    /**
     * 获取统计人员
     *
     * @return census_pro - 统计人员
     */
    public String getCensusPro() {
        return censusPro;
    }

    /**
     * 设置统计人员
     *
     * @param censusPro 统计人员
     */
    public void setCensusPro(String censusPro) {
        this.censusPro = censusPro;
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