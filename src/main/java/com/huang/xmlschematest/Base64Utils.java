package com.huang.xmlschematest;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author hsz
 */

public class Base64Utils {
    /**
     * 使用Base64加密字符串
     *
     * @return 加密之后的字符串
     */
    public static String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 使用Base64解密
     *
     * @return 解密之后的字符串
     */
    public static String decode(String data) {
        return new String(Base64.getDecoder().decode(data.replace("\"", "")), StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        String encode = encode("{\"key\":\"kiki123\",\"value\":\"hello lmbx\"}");
        System.out.println(encode);
        String decode = decode("eyJrZXkiOiIxMjMiLCJ2YWx1ZSI6ImFhYSJ9");
        System.out.println(decode);

    }
}
