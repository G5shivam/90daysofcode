package pattern;

import java.util.Scanner;

public class invertedpyramid{
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("Enter the row size:");
      
          int row_size=cs.nextInt();
      
          for(int out=1;out<=row_size;out++)
          {
           for(int in=1;in<out;in++)
      
            System.out.printf(" ");
           for(int in=row_size;in>=out;in--)
            System.out.printf("* ");
      
           System.out.println();
          }
        cs.close();
       }
    
}