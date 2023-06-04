package File_Handling;

import java.io.*;
public class Bufferedwrite {
    public static void main(String[] args) throws Exception{
        
        File dir=new File("javafile");

        File file=new File(dir,"skill.txt");

        FileWriter fw=new FileWriter(file,true);
        
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("G5shivam");
        bw.newLine();
        bw.write("hello");
        bw.newLine();
        bw.write(65);
        

        bw.close();




    }
}
