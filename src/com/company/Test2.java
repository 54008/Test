package com.company;

public class Test2 <E>{
    int age;
    String name;
    E sex;
    public  void a(E n){

    }
    public  void b (E[] c){

    }


    public static void main(String[] args) {
        Test2 aa=new Test2();
        aa.a("5645");
        aa.a(5454);
        aa.a(1.33);
        aa.b(new String[]{"a","dd","ddd"});

        Test2<String> bb=new Test2<>();
        bb.sex="555";
        bb.a("as745d45as");
        bb.b(new String[]{"a","b","c"});

    }
}
