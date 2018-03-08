package com.zhidevelop.util;


import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

/**
 * description MD5 加密算法
 * author enzoluo
 * time 2017-11-17 15:05
 * version v1.0
 **/
public class MD5Util {
    public static String encodeByMD5(String str) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String newStr = base64Encoder.encode(md5.digest(str.getBytes()));
        return newStr;
    }
}
