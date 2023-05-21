package Exception.Exception;

import java.util.Scanner;

public class Exceptionresource {
    public static void main(String[] args) {
        int num=0;
        //try with resource
        try(Scanner sc = new Scanner(System.in))
        {
            num=sc.nextInt();
        }
        System.out.println(num);
    }
}
