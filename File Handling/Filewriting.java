package File_Handling;

import java.io.*;

public class Filewriting {
    public static void main(String[] args) throws IOException{
       File dir=new File("javafile");
       File file=new File(dir,"skill.txt");

       FileWriter fw=new FileWriter(file,true);

       fw.write("jav");
       fw.write("\n");
       fw.write(65);
       fw.write("\n");
       fw.write("G5shivam");
       fw.write("\n");

       fw.close();

       System.out.println("open skill.txt to see result");
    }
   

}
