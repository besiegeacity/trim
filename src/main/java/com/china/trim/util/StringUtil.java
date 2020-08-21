package com.china.trim.util;

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
}
