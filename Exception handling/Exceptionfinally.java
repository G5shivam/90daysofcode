package Exception.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionfinally {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        try{
            num=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("enter a number"+ e);
        }
        finally{
            sc.close();
        }
        System.out.println(num);
    }
}
