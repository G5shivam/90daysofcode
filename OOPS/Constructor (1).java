
// class Student{
//     private String name;
//     private int age;

//     Student(String name , int age ){
//         this.name=name;
//         this.age=age;
//     }
//     public String getName()
//     {
//         return name;
//     }
//     public int getAge(){
//         return age;
//     }
// }

// public class Constructor {
//     public static void main(String[] args) {
//         Student st= new Student("shivam", 22);
        

//         String name=st.getName();
//         System.out.println(name);

//         int age=st.getAge();
//         System.out.println(age);
        

//     }

   
// }

//using super and this 

  class Student1
{
   private String name;
   private int age;

   public Student1(String string)
   {
    this("shivam",22);
    System.out.println("default constructor is called");
    name="Harshit";
    age = 20;

   }

   public Student1(){
    this();
    this.name=name;
    age=19;
   }
   public Student1(String name,int age)
   {
    this.name=name;
    this.age=age;
   }
       public void disp()
       {
        system.out.println(name);
        system.out.println(age);
       } 
    }

    public class Constructor
    {
        public static void main(String[] args) {
            Student1 st1 = new Student1();
            st1.disp();
            Student1 st2= new Student1("G5shivam");
            st2.disp();
        }
    }
