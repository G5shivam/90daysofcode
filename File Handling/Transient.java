package File_Handling;

import java.io.*;
class Cricketer1 implements Serializable
{
    String name;
    transient int age;
    int runs;

    public Cricketer1(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs =runs;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class Transient {
    public static void main(String[] args) throws Exception {
        // Cricketer1 cc=new Cricketer1("virat",36,26000);
        // cc.disp();
        // FileOutputStream foos=new FileOutputStream("java1.txt");
        // BufferedOutputStream boos=new BufferedOutputStream(foos);
        // ObjectOutputStream ooss=new ObjectOutputStream(boos);
        
        // ooss.writeObject(cc);
        // ooss.flush();
        // ooss.close();

        FileInputStream fiif=new FileInputStream("java1.txt");
	BufferedInputStream biis=new BufferedInputStream(fiif);
	ObjectInputStream oiss=new ObjectInputStream(biis);
	Cricketer1 crii=(Cricketer1)oiss.readObject();
	crii.disp();



    }

}
