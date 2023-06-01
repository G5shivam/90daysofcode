package File_Handling;

import java.io.File;
import java.io.IOException;

public class Directory {
    public static void main(String[] args) throws IOException {
        File dir1=new File("javafile");
       // System.out.println(dir1.isDirectory());
        dir1.mkdir();

        System.out.println("dir1 is refering to directory javafile:"+ dir1.isDirectory());

       
        File file2=new File(dir1,"skill.txt");
        file2.createNewFile();
        System.out.println("file is refering to skill.txt "+ file2.isFile());
    }

    
    
}
