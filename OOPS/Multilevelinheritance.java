package OPPS;

class Animal{
    void lived()
    {
        System.out.println("Animal lived in jungle");
    }
}

class Tiger extends Animal{

}
class Monkey extends Tiger{

}




public class Multilevelinheritance {
        
    public static void main(String[] args) {
     Monkey d = new Monkey();
     d.lived();
    }
}
