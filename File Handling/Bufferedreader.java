package File_Handling;

import java.io.*;

public class Bufferedreader{
    public static void main(String[] args) throws Exception {
        File dir=new File("javafile");
        File file =new File(dir,"skill.txt");
      
        FileReader fr =new FileReader(file);
      
        BufferedReader br = new BufferedReader(fr) ;
            String line=br.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=br.readLine();
            }
    
    


    }
}