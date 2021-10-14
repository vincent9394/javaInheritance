package com.agileexlab;

import com.agileexlab.animal.Tiger;

public class Main {
    public static void main(String[] arg) {
        Tiger rocky = new Tiger(12,60,true,true,true);
        boolean meow = rocky.isMeowSound();
        System.out.println(meow);
    }

}
