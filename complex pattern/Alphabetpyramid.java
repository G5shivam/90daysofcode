package pattern;

import java.util.Scanner;
public class Alphabetpyramid {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);

	    System.out.println("Enter the row size:");
	    int row_size=cs.nextInt();
        int np=row_size*2-1,in,out;
        for(out=row_size-1;out>=0;out--)
	    {
	     for(in=row_size-1;in>out;in--)
	      System.out.printf(" ");
	     for(int p=0;p<np;p++)
	      System.out.print((char)(out+65));
	      np-=2;
	     System.out.println();

	    }
	    cs.close();
		}
	}


