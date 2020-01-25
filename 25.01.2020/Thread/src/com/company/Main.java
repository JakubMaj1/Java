package com.company;

public class Main {

    public static void main(String[] args) {
       Divisibility counter1 = new Divisibility(new Runnable(){
           @Override
           public void run() {

           }
       });
       Divisibility counter2 = new Divisibility(new Runnable() {
           @Override
           public void run() {

           }
       });
       Divisibility counter3 = new Divisibility(new Runnable() {
           @Override
           public void run() {

           }
       });
       Divisibility counter4 = new Divisibility(new Runnable() {
           @Override
           public void run() {

           }
       });
       Divisibility counter5 = new Divisibility(new Runnable() {
           @Override
           public void run() {

           }
       });

       counter1.fromCount = 0;
       counter1.toCount = 100;

       counter2.fromCount= 100;
       counter2.toCount = 200;

       counter3.fromCount = 200;
       counter3.toCount = 300;

       counter4.fromCount= 300;
       counter4.toCount = 400;

       counter5.fromCount = 400;
       counter5.toCount = 500;

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();
        counter5.start();

    }
}
