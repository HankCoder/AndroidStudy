package com.example.administrator.intentservicetest;

/**
 * Created by Administrator on 2016/12/8 0008.
 */
public class SayHi {

    public String sayHi(String a, String b){
        Adder adder = new Adder(); //实例化了一个adder，作用就是将两个字符串加在一起。
        String result = "";

        result = adder.add(a, b);
        return result;
    }
}

