package objectexamples;

public class ObjectDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Foo f = new Foo();
		Foo f = new child2();
		int n = f.getSeats();
		System.out.println(n);
		f.add1Passenger();
		System.out.println(f.getSeats());
		
		Object o = new child2();
		System.out.println(o.hashCode());
		
		System.out.println(f.getClass());
		
		System.out.println(o.toString());
	
		
		
		
		

	}

}

class Foo
{
	static int passenger = 0;
	int i =1;
	int getSeats()
	{
	return 150;
	}
	
	public void add1Passenger()
	{
		if(hasSeating())
		{
			passenger+=1;
			System.out.println(passenger);
			System.out.println(getSeats());
		}
		else
		{
			
		}
	}
	private boolean hasSeating()
	{
		return passenger<getSeats();
	}
}

class child2 extends Foo
{
	int i=2;
	int getSeats()
	{
	return 10;
	}
}
