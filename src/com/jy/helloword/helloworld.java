package com.jy.helloword;

import java.util.HashMap;

public class helloworld {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
         System.out.print("a");
        }
         HashMap<String,String> map=new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");
        String age=map.get("age");
        System.out.print("age="+age);
        map.remove("major");
        System.out.print(map);
        System.out.print(map);
    }
}
