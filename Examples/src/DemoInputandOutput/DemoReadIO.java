package DemoInputandOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoReadIO {

	public static void main(String[] args) throws IOException {
		// 	
		FileIO1 f = new FileIO1();
		f.readFileToData();
		f.readFileToDataAgain();
		

	}

}

class FileIO1
{
	public void readFileToData() throws IOException
	{
		File file = new File("/Users/sugen/Downloads/save1.csv");
		FileInputStream fin	= new FileInputStream(file);
		int i=0;
		char ch = ' ';
		while((i=fin.read())!=-1)
		{
			ch = (char)i;
			System.out.print(ch);
		}
		fin.close();
			
		
	}
	
	public void readFileToDataAgain() throws IOException
	{
		File file = new File("/Users/sugen/Downloads/save1.csv");
		FileReader fin	= new FileReader(file);
		BufferedReader br = new BufferedReader(fin);
		String line = "";
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			String a[] = line.split(",");
			System.out.println(a[0]+" "+a[1]+" "+a[2]);
		}
	br.close();
	fin.close();
	}
}
