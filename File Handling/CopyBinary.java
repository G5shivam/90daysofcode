package File_Handling;

import java.io.*;
public class CopyBinary{
	public static void main(String s[]) {
		FileInputStream fr=null;
		FileOutputStream fw=null;
		int ch;
	    try {
			fr=new FileInputStream("src/Welcome.java");
			fw=new FileOutputStream("src/welcome1.java");
				while((ch=fr.read())!=-1) {
					fw.write(ch);
				}
			System.out.println("File copied");
	    	fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}