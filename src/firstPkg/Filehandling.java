package firstPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Filehandling
{
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/test.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);  //load all the data in memory
		
		System.out.println(prop.get("browsername"));
		
		System.out.println(prop.get("url"));
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is forth line of the file");
		fw.flush();
		fw.close();
		
	}
	
	static int i = 30;

	public static void readdata() throws Exception
	{
		
		System.out.println(i);
		
		//File f = new File("C:\\Users\\Santosh\\Desktop\\file.txt");   //file connection
		
		//File f = new File("./TestData/abc.txt");   //file connection
		
		FileReader fr = new FileReader("./TestData/abc.txt");
				
		
		int r = fr.read();   //r=116
		
		while(r!=-1)  //116!=-1, 104!=-1, -1!=-1
		{
			System.out.print((char)r);  //th
			r = fr.read();  //h=104
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws Exception 
	{
	
		
		Filehandling.readprop();
		Filehandling.writedata();
		
	}
	
}
