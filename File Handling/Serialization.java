package File_Handling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable{
    private String name;
    private int age;
    private int runs;
    
    public Cricketer(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }

    
}

public class Serialization{
    public static void main(String[] args) throws Exception{
        Cricketer c=new Cricketer("sachin", 44, 30000);
        FileOutputStream fos=new FileOutputStream("java.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();

        System.out.println("done successfully");
    }
}