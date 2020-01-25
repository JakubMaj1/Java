package com.company;

public class Divisibility extends Thread {
    public int fromCount = 0;
    public int toCount;

    public Divisibility(Runnable runnable) {
    }


    @Override
    public void run() {
       for(;fromCount < toCount;fromCount++){
           if(fromCount % 3 == 0){
               System.out.println(fromCount);
           }
       }
    }
}
