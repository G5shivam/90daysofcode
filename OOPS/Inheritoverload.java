package OPPS;

class Aeroplane
{
    public void takeoff()
    {
        System.out.println("aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}

class Cargoplane extends Aeroplane
{
    public void fly()
    {
        System.out.println("Cargoplane flies at lower height");

    }
    public void carrygoods()
    {
        System.out.println("cargoplane carries goods");
    }
}

class Passengerplane extends Aeroplane
{
    public void fly()
    {
        System.out.println("passengerplane flies at medium height");
    }
    public void carrypassenger()
    {
        System.out.println("passengerplane carries passenger");
    }
}


public class Inheritoverload {
    public static void main(String[] args) {
        Cargoplane cp=new Cargoplane();
        cp.takeoff();
        cp.fly();
        cp.carrygoods();

        Passengerplane pp=new Passengerplane();
        pp.takeoff();
        pp.fly();
        pp.carrypassenger();
    }
}
