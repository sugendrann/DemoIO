package objectexamples;



public class DemoObjectrelation {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		One o = new One(new Two(new Three(10)));
		o.cube();

	}

}

class One
{
	Two t;
	One(Two t)
	{
		this.t=t;
	}
	void cube()
	{
		t.cube();
	}
	
}

class Two
{
	Three th;
	Two(Three th)
	{
		this.th=th;
	}
	void cube()
	{
		th.cube();
	}
}

class Three
{
	int x;
	Three(int x) 
	{
	this.x=x;	
	}
	protected void cube()
	{
		System.out.println("cube:"+(x*x*x));
	}
}
