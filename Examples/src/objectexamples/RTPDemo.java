package objectexamples;

public class RTPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child b = new child();
		b.display();

	}

}

class base
{
	int x=20;
	base()
	{
		System.out.println("Base class constructed");
	}
	void display()
	{
		System.out.println("Base"+x);
	}
}

class child extends base
{
	child()
	{
		System.out.println("Child class constructed");
	}
	void display()
	{
		System.out.println("child"+x);
	}
}