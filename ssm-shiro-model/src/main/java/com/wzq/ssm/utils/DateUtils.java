package com.wzq.ssm.utils;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateUtils {


    /**
     * 将含年月日时分秒的字符串日期对象转变为Date类型的对象,格式必须为yyyy年MM月dd日
     * @param yyyy/MM/dd/ HH:mm
     * @return
     * @throws ParseException
     */
    public static Date getDate(String yyyy年MM月dd日HH时mm分ss秒) throws ParseException
    {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd/ HH:mm");
        Date date=dateFormat.parse(yyyy年MM月dd日HH时mm分ss秒);
        return date;
    }
    /**
     * 将含年月日的字符串日期对象转变为Date类型的对象
     * @param yyyy年MM月dd日
     * @return
     * @throws ParseException
     */
    public static Date getDate1(String yyyy年MM月dd日) throws ParseException
    {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        Date date=dateFormat.parse(yyyy年MM月dd日);
        return date;
    }
    /**
     *
     * @param yyyy_MM_dd
     * @return
     * @throws ParseException
     */
    public static Date getDate2(String yyyy_MM_dd) throws ParseException
    {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=dateFormat.parse(yyyy_MM_dd);
        return date;
    }



    /**
     * 将字符串转换为时间
     * @param yyyy_MM_dd_HH_mm_ss
     * @return
     * @throws ParseException
     */
    //2018-8-15 9:45:59->date
    public static Date getDate3(String yyyy_MM_dd_HH_mm_ss) throws ParseException
    {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=dateFormat.parse(yyyy_MM_dd_HH_mm_ss);
        return date;
    }




    /**
     * date->String
     * @param date
     * @return	yyyy年MM月dd日  返回字符串时间戳
     */
    public static String getDateString(Date date)
    {
        String strDate;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        strDate=simpleDateFormat.format(date);
        return strDate;
    }
    /**
     * Date->String
     * @param date
     * @return	yyyy/MM/dd HH:mm
     */
    public static String getDateString1(Date date)
    {
        String strDate;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        strDate=simpleDateFormat.format(date);
        return strDate;
    }
    /**
     * Date->String
     * @param date
     * @return	yyyy-MM-dd
     */
    public static String getDateString3(Date date)
    {
        String strDate;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        strDate=simpleDateFormat.format(date);
        return strDate;
    }
    /**
     * Date->String
     * @param date
     * @return	yyyy-MM-dd HH:mm:ss
     */

    public static String getDateString4(Date date)
    {

        String strDate;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        strDate=simpleDateFormat.format(date);
        return strDate;
    }


}
