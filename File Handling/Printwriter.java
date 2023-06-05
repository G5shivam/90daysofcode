package File_Handling;

//printwriter is use to store any type of data

import java.io.*;

public class Printwriter {
    public static void main(String[] args) throws Exception {
        
        File dir=new File("javafile");
        File file=new File(dir,"skill.txt");

        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);

        pw.println("java");
        pw.println(100);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);

        pw.close();
    }
}
