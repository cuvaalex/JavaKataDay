package com.finix.alexcuva.kataday.day8;

public class Tortoise {
    public static int[] race(int v1, int v2, int lead) {
       if(v1 >= v2){
           return null;
       }
       int gapSpeed = v2-v1;
       int seconds = (lead * 3600) / gapSpeed;
       int hours = seconds / 3600;
       int min = (seconds % 3600) / 60;
       int sec = seconds % 60;
       return new int[] {hours, min, sec};
    }


}