package apiannotations;

@FunctionalInterface
interface Demo
{
    void disp();
}
@Deprecated
class Plane
{
    public void planefliesatgoodheight(){
        System.out.println("plane is flying");
    }
}
class Cargoplane extends Plane{
    @Override
    public void planefliesatgoodheight(){
        System.out.println("Cargoplane flies low");
    }
}
public class Annotations {
    public static void main(String[] args) {
        // object of child class
        Plane cp=new Cargoplane();
        cp.planefliesatgoodheight();
    }
    
}
