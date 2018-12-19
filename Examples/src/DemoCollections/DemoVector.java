package DemoCollections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(100,"Sugi");
		List<Object> list1 = new Vector<Object>();
		list1.add(p);
		Person p2 = new Person(200,"Ram");
		list1.add(p2);
		Iterator<Object> itr = list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}

