package OPPS;

class Animal{
    void lived()
    {
        System.out.println("Animal lived in jungle");
    }
}

class Tiger extends Animal{

}
class Monkey extends Animal{

}



public class HierarchicalInherit {
    public static void main(String[] args) {
        Monkey M = new Monkey();
        Tiger t=new Tiger();
        t.lived();
        M.lived();
    }
    
}
