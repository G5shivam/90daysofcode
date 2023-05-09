package OPPS;

class Animal{
    public void animalsound(){
        System.out.println("the animal makes a sound");
    }
}

class cat extends Animal{
    public void animalsound(){
        System.out.println("the cat makes a sound");
    }
}

class Dog extends Animal{
    public void animalsound(){
        System.out.println("the dog makes a sound");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal a1= new Animal();
        Animal a2= new cat();
        Animal a3= new Dog();

        a1.animalsound();
        a2.animalsound();
        a3.animalsound();
    }
}
