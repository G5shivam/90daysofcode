package File_Handling;

import java.io.*;

public class Filecount {
    public static void main(String[] args) throws IOException {
        int count=0;
        File f=new File("javafile");
        String str[]=f.list();
        for(String name:str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("no.of file are:"+count);
    }
}
