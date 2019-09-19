package com.wzq.ssm.model;


import com.wzq.ssm.utils.DateUtils;

import java.text.ParseException;
import java.util.Date;

public class CommunityInfo {
    /**
     * 商品id
     */

    private Integer id;

    /**
     * 商品名称
     */
    private String tradename;

    /**
     * 类别
     */
    private String cate;

    /**
     * 供货商号
     */

    private String supplierid;

    /**
     * 进货日期
     */
    private Date purchtime;

    /**
     * 进货日期字符串
     */
    private String purchtimeStr;

    /**
     * 单价
     */
    private Double price;

    public String getPurchtimeStr() {


        return purchtimeStr;
    }

    public void setPurchtimeStr(String purchtimeStr) {
        try {
            this.purchtime = DateUtils.getDate3(purchtimeStr);
            this.purchtimeStr = purchtimeStr;
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }

    /**
     * 获取商品id
     *
     * @return id - 商品id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置商品id
     *
     * @param id 商品id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return tradename - 商品名称
     */
    public String getTradename() {
        return tradename;
    }

    /**
     * 设置商品名称
     *
     * @param tradename 商品名称
     */
    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    /**
     * 获取类别
     *
     * @return cate - 类别
     */
    public String getCate() {
        return cate;
    }

    /**
     * 设置类别
     *
     * @param cate 类别
     */
    public void setCate(String cate) {
        this.cate = cate;
    }

    /**
     * 获取供货商号
     *
     * @return supplierID - 供货商号
     */
    public String getSupplierid() {
        return supplierid;
    }

    /**
     * 设置供货商号
     *
     * @param supplierid 供货商号
     */
    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    /**
     * 获取进货日期
     *
     * @return purchtime - 进货日期
     */
    public Date getPurchtime() {
        return purchtime;
    }

    /**
     * 设置进货日期
     *
     * @param purchtime 进货日期
     */
    public void setPurchtime(Date purchtime) {
        this.purchtime = purchtime;
         this.purchtimeStr = DateUtils.getDateString4(purchtime);

    }

    /**
     * 获取单价
     *
     * @return price - 单价
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "CommunityInfo{" +
                "id=" + id +
                ", tradename='" + tradename + '\'' +
                ", cate='" + cate + '\'' +
                ", supplierid='" + supplierid + '\'' +
                ", purchtime=" + purchtime +
                ", purchtimeStr='" + purchtimeStr + '\'' +
                ", price=" + price +
                '}';
    }
}