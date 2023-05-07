package OPPS;

//Encapsulation using setter and getter

class Student{
    private int age;
    private String name; 

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name)
    {
        this.name="Shivam";
    }
    public String getName()
    {
        return name;
    }
   

}

public class Studentdetail {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setAge(18);
        obj.setName("Shivam");
        
        System.out.println("Age is :: " + obj.getAge());
        System.out.println("Name is :: " + obj.getName());
        

    }
}
