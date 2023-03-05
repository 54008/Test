package com.company;
import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public void a(List<?> list){
        for (Object a:list)
        {
            System.out.println(list);
        }
        list.add(null);
        Object s=list.get(0);
        }

    public static void main(String[] args) {
        Test8 t =new Test8();
        t.a(new ArrayList<Integer>());
        t.a(new ArrayList<String>());
        t.a(new ArrayList<Object>());

    }

}

