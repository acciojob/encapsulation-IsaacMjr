package com.driver;

public class Main {
    public Main() {
        RWOnly obj = new RWOnly();
//        obj.name ="Isaac";
        //the error displayed is name has a private access restriction in RWONly
//        System.out.print(obj.name);
        obj.setName("Isaac");
        obj.getName();
    }
}