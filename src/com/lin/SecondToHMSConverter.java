package com.lin;

public class SecondToHMSConverter {
    public void convert(int seconds) {

        int minutes = 0;
        int hours = 0;
        if (seconds > 60) {
            minutes =  seconds / 60;
            seconds %= 60;
        }

         if (minutes > 60) {
             hours = minutes / 60;
             minutes %= 60;
         }
        System.out.println(hours + " h : " + minutes + " m : " + seconds + " s");

    }
}
