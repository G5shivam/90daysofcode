package File_Handling;

import java.io.*;

public class Directorycreation {
    public static void main(String[] args) throws IOException
    {
        File dir=new File("new");
        System.out.println(dir.exists());

        dir.mkdir();
        System.out.println(dir.exists());
    }
    
}
