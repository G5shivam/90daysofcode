interface Computer
{
    void compilecode();
    
   

}

class Laptop implements Computer
{
    public void compilecode()
    {
        System.out.println();
    }
}

class Desktop implements Computer
{
    public void compilecode(){
        System.out.println(" you got 5 error faster");
    }

}

class Developer
{
    public void BuildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.compilecode();
    }
}

public class Interface{
    public static void main(String[] args) {
        Computer obj = new Laptop();
        Developer dev = new Developer();
        dev.BuildApp(obj);
        
    }

}