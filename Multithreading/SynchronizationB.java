package Multithreading;

// synchronization of the block

class Truck implements Runnable
{
    public void run()
    {
        try 
        {
           System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
           Thread.sleep(2000);
           
           synchronized(this)
           {
            System.out.println(Thread.currentThread().getName() + " Got into Car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Came back and parked the car");
           }
          
           
            
        }
         catch (Exception e) 
         {
           System.out.println("Some problem");
        }
    }

}

public class SynchronizationB
{
    public static void main(String[] args) 
    {
        Truck cc=new Truck();

        Thread t11=new Thread(cc);
        Thread t22=new Thread(cc);
        Thread t32=new Thread(cc);

        t11.setName("SON-1");
        t22.setName("SON-2");
        t32.setName("SON-3");

        t11.start();
        t22.start();
        t32.start();
        
    }
    
}


