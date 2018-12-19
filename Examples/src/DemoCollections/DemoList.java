package DemoCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> list1 = new ArrayList<Object>();
		list1.add("Sugendran");
		list1.add(27);
		list1.add('N');
		
		
		
		Person p = new Person(100,"Sugi");
		list1.add(p);
		System.out.println(list1);
		Iterator<Object> itr = list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		int length = list1.size();
		for(int i=0;i<length;i++)
		{
			System.out.println(list1.get(i));
		}
		for(Object o:list1)
			System.out.println(o);
		
		System.out.println("============================");
		
		while(list1.contains(p))
		{
			System.out.println(list1.remove(p));
		}
		System.out.println(list1);
		
		Person p1 = new Person(200, "Ram");
		list1.add(p1);
		
		System.out.println("===============================");
		System.out.println(list1);
		ListIterator<Object> li = list1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("====================");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

	}

}
class Person
{
	int id;
	String name;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		String s = id+" "+name;
		return s;
	}
}