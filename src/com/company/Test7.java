package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        List<Object> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<String> list3=new ArrayList<>();
        List<?> list=null;
        list=list1;
        list=list2;
        list=list3;
    }
}
