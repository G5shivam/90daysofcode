package OPPS;

class Human{
    int age;
    void emotion()
    {
        age=22;
        System.out.println("Human have feeling");
        System.out.println(age);
    }
}

class Man extends Human{

}

public class Inheritance {

    public static void main(String[] args) {
        Man st=new Man();
        
        st.emotion();
        
    }
}
