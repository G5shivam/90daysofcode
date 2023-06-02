package File_Handling;

import java.io.*;


public class Readfile {
    public static void main(String[] args) throws IOException {
        File dir=new File("javafile");

        File file=new File(dir,"skill.txt");

        try (FileReader fd = new FileReader(file)) {
            int i=fd.read();

            while(i!=-1)
            {
                System.out.print(i + "------> ");
                System.out.println(( char)i );
                i=fd.read( );
            }
        }

    }
}
