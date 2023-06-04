package File_Handling;

// read file using array
import java.io.*;

public class Readfile2 {
    public static void main(String[] args) throws IOException {
        
        File dir = new File("javafile");
        File file =new File(dir,"skill.txt");

        try (FileReader fd = new FileReader(file)) {
            char ch[]=new char[(int)file.length()];
            
            fd.read(ch);
            for(char data:ch){
                System.out.print(data);
            }
        }
    }
}
