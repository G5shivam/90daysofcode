package Multithreading;

import java.util.*;

class calc extends Thread
{
    public void run(){
        System.out.println("calculation task started");
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter first number:");
        int num1=sc.nextInt();
        System.out.println("please enter second number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("calculation task ended");
        System.out.println("*****************************************");

    }
}

class message extends Thread{
    public void run(){
        System.out.println("Displaying important message task");
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("focus is important to master skills:");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("some problem");
        }
        System.out.println("displaying import message task ended");

    }
}


public class Multithreads_creation {
    public static void main(String[] args) {
        System.out.println("main thread");

        calc t1=new calc();

        message t2=new message();
        t1.start();
        t2.start();
    }
}
