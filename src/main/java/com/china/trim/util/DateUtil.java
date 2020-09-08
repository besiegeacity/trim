package com.china.trim.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public interface DATE_PATTERN{
        String YYYY_MM_DD_HH_MM_SS="yyyy_MM_dd HH:mm:ss";
    }
    public static String getCurrentDate(){
        SimpleDateFormat sdf=new SimpleDateFormat(DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
        Date date=new Date();
        return sdf.format(date);
    }
}
