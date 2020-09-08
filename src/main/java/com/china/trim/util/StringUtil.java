package com.china.trim.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    /**
     * 判断字符串是否为空
     *
     * @param string
     * @return
     */
    public static boolean isEmpty(String string){
        return null==string||"".equals(string.trim());
    }

    /**
     * 将object对象转为字符串
     *
     * @param object
     * @return
     */
    public static String getStrValue(Object object){
        if(null!=object){
            String.valueOf(object);
        }
        return "";
    }

    /**
     * 判断是否是手机号码
     *
     * @param phoneNum
     * @return
     */
    public static boolean isPhoneNum(String phoneNum){
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(phoneNum);
        return m.matches();
    }
}
