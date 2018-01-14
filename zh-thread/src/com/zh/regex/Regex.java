package com.zh.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description: 正则。。。<BR>
 * <p>

 * @date 2018/1/14 12:59
 */
public class Regex {

    public static void main(String[] args) {
        String isNeedTestData = "我的主邮箱是：s123saix@qq.cLom，第二邮箱是：10010@per.com.cn";
        email(isNeedTestData);
        System.out.println("数据[s111aix@qq.cLo]是email格式吗？"+isEmail("s111aix@qq.com.cn"));
    }


    /**
     * 匹配邮箱
     * @param data 要匹配的数据
     */
    private static void email(String data){
        String regex = "[\\w]+@[\\w]+\\.[a-zA-Z]+\\.?[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()){
            sbAppend(matcher.group(0), stringBuilder);
            System.out.println("从数据["+data +"]\n    找到的邮箱号数据是："+stringBuilder);
        }
    }
    private static boolean isEmail(String data){
        String regex = "[\\w]+@[\\w]+\\.[a-zA-Z]+\\.?[a-zA-Z]+";
//        regex = "/\\w+((-w+)|z(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+/";
        Pattern pattern = Pattern.compile(regex);
        return Pattern.matches(regex,data);
    }

    private static void sbAppend(String data, StringBuilder stringBuilder) {
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append(data);
    }

}
