package File_Handling;

import java.io.*;


public class Filecreation {
    public static void main(String[] args) throws IOException
     {
        File File1=new File("new.txt");
        System.out.println(File1.exists());

        File1.createNewFile();
        System.out.println(File1.exists());
    }
    
}
