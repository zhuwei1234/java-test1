/*
主要是测试在不同的方法中定义了对象，对象的取值原理
author：zhuwei
date:  2020-08-15
 */
public class Tester{

    public static  void a (human h) {
     //   h= new human();
        h.name="张三";
    }
    public static  void main (String[]args){
                 human h = new human();
                 h.name="李四";
                 Tester.a(h);
                 System.out.println(h.name);
    }
}
  class  human {
String name;
}