/*
主要实现 各种的String 的常用的API方法
author :zhuwei
date:2020-08-15
 */

public class string_info {
    String a = new String("asdfhlkqweyiozxcvbmmwqeqweq123dee");
    String b =new String("asdfhlkqweyiozxcvbmmwqeqweq123dee");
    int length = a.length();//返回字符串的长度
    char ch=a.charAt(3);//返回字符串中指定位置的字符；
    int index = a.indexOf("dfh");//返回指定字符的位置
    int last  =a.lastIndexOf("d");//返回最后一次出现的字符的位置
    String str =a.substring(3);//从beginIndex位置起，从当前字符串中取出剩余的字符作为一个新的字符串返回
    String str1 = a.substring(3,6);
    boolean than =a.equals(b);

    public static void main(String[]args){
        string_info a =new string_info();
        System.out.println(a.length);
        System.out.println(a.ch);
        System.out.println(a.index);
        System.out.println(a.last);
        System.out.println(a.str);
        System.out.println(a.str1);
        System.out.println(a.than);

    }


}
