package apiannotations;

// declaring enum outside of the class
enum Result1
{
    PASS,FAIL,NR;
    int marks;
    Result1()
    {
        System.out.println("constructor in Enum");
    }
    void Setmarks(int marks){
        this.marks=marks;
    }
    
    int getmarks()
    {
        return getmarks();
    }
}

public class Enumoutside {
    public static void main(String[] args) {
        Result1.PASS.Setmarks(50);
        int m1=Result1.PASS.getmarks();
        System.out.println(m1);

        Result1.FAIL.Setmarks(45);
        int m2=Result1.FAIL.getmarks();
        System.out.println(m2);

        Result1.NR.Setmarks(0);
        int m3=Result1.NR.getmarks();
        System.out.println(m3);
    }
}
