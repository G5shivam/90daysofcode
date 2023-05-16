package OPPS;

class Anim
{
    public void eat()
    {
        System.out.println("Animal eats everyday");
    }
    public void age()
    {
        System.out.println("Animal age is:");
    }
}

class Tig extends Anim
{
    public void eat()
    {
        System.out.println("Tiger hunts and eat");
    }
    public void age(){
        System.out.println("Tiger age is:");
    }
}

public class Overrideinherit {
    public static void main(String[] args) {
        Tig t =new Tig();
        t.eat();
        t.age();

    }
}
