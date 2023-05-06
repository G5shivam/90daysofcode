package Staticvvv;

import java.util.Scanner;

class Loan{
int pa;
float td;
static float ri;
float si;


static{
    ri=8.5f;
}
void input()
{
    Scanner scan =new Scanner(System.in);
    System.out.println("please mention the amount required");
    pa=scan.nextInt();
    System.out.println("please mention time duration");
    td=scan.nextFloat();
}
void compute()
{
    si=(pa*ri*td)/100f;
}
void disp(){
    System.out.println("SI is:"+si);
}

}
public class SIcalculator {
    public static void main(String[] args) {
        
        Loan l1 = new Loan();
        l1.input();
        l1.compute();
        l1.disp();
        Loan l2 = new Loan();
        l2.input();
        l2.compute();
        l2.disp();
    }

    @Override
    public String toString() {
        return "SIcalculator []";
    }
}


