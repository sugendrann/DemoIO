package datahandling;

public class CallbyRefExample {
	int a = 20;
	void change(Object o)
	{
		a = a *10;
	}
	void valuechange(int y)
	{
		this.a = y;
		a = a/20;
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallbyRefExample c = new CallbyRefExample();
		System.out.println(c.a);
		c.change(c);
		System.out.println(c.a);
		c.valuechange(c.a);
		System.out.println(c.a);
		int y = 100;
		System.out.println(y);
		change(y);
		System.out.println(y);
		int r = 1;
		r++;
		System.out.println(r);
	}
	public static void change(int y)
	{
		y=y*100;
		System.out.println(y);
	}

}
