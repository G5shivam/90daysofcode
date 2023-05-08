class Demo{
    private int a;
    private int b;

    public Demo()
    {
        System.out.println("zero parametrized constructor");
    }

    public Demo(int a, int b){
        this.a=a;
        this.b=b;
    }

    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}



public class Defaultconstructor {
    public static void main(String[] args) {
        Demo d= new Demo();
        d.disp();

        Demo d2= new Demo(50,60);
        d2.disp();
    }
}
