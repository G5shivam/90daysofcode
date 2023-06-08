package pattern;

import java.util.Scanner;
public class AlphabetInverted {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);    
     System.out.println("Enter the row and column size:");
     int out,in,p;
     char row_size=cs.next().charAt(0);
     for(out=row_size;out>='A';out--)
     {
      for(in=row_size-1;in>=out;in--)
      System.out.print(" ");
      for(p='A';p<=out;p++)
      System.out.print((char)out);
      System.out.println();
     }
   
 }
}
  

