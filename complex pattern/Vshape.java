package pattern;

import java.util.Scanner;
public class Vshape{

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("Enter the row size:");
       int i,j;
       int row_size=cs.nextInt();
       int print_control_x=1;
       int print_control_y=row_size*2-1;
       for(i=row_size;i>=1;i--)
       {
           for(j=1;j<=row_size*2;j++)
           {
               if(j==print_control_x || j==print_control_y)
               {
                  System.out.print((char)(i+64));
               }
               else
               {
                System.out.printf(" ");    
               }
           }
           print_control_x++;
           print_control_y--;
           System.out.println(); 
       }
       cs.close();

    }
}