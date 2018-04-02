package com.finix.alexcuva.kataday.day7;

public class Maskify {
    public static String maskify(String str) {
        if(str.length() < 5){
            return str;
        }
        return new String(new char[str.length()-4]).replace("\0", "#")  + str.substring(str.length()-4);
    }
}
