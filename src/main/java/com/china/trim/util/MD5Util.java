package com.china.trim.util;

import org.springframework.util.DigestUtils;

public class MD5Util {
    public static String getMd5(String plainText){
        return DigestUtils.md5DigestAsHex(plainText.getBytes());
    }
    public static void main(String[] args) {
        System.out.println(getMd5("helloWord"));
    }
}
