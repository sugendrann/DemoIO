package DemoInputandOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DemoIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Person p = new Person(100, "Sugendran", 20000);
		FileIO f = new FileIO();
		System.out.println(p);
		Person p1 = new Person(200, "Ram", 30000);
		System.out.println(p1);
		String data = p.toString();
		f.writeDataToFile(data);
		
		data = p1.toString();
		f.writeDataToFile(data);
		
		

	}

}

class Person
{
	int id,salary;
	String name;
	Person(int id,String name,int salary)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	public String toString()
	{
		String r = id+","+name+","+salary+"\n";
		return r;
	}

	public byte[] getBytes() {
		// TODO Auto-generated method stub
		return null;
	}
}

class FileIO
{
	void writeDataToFile(String data) throws IOException,NullPointerException
	{
		try
		{
		File file = new File("/Users/ram/Downloads/save1.txt");
		//FileOutputStream out = new FileOutputStream(file,true);
		//out.write(data.getBytes());
		//out.close();
		FileWriter fout = new FileWriter(file,true);
		fout.write(data);
		fout.close();
		System.out.println(file.getName()+"Written");
		}
		catch(Exception e)
		{
			System.out.println("Some exception:"+e);
		}
		
	}
}