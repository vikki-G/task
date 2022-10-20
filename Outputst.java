package oct12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Outputst {
	public static void main(String[] args) throws IOException {
	FileOutputStream fa = new FileOutputStream("C:\\Users\\Admin\\Downloads\\G vikki\\gg.txt");
	DataOutputStream aa = new DataOutputStream(fa);
	 aa.writeInt(65);  
     aa.writeUTF("vikki"); 
     aa.flush();
     aa.close();
     
     FileInputStream gg = new FileInputStream("C:\\Users\\Admin\\Downloads\\G vikki\\xc.txt");
     DataInputStream goo = new DataInputStream(gg);
     int count = gg.available();  
     byte[] ary = new byte[count];  
     goo.read(ary);  
     for (byte bt : ary) {  
       char k = (char) bt;  
       System.out.print(k+"-");  
	}
	
	}}

