package objectexamples;

class Window
{
	int width;
	int height;
	
	void setWindowDetails(int w,int x)
	{
		width = w;
		height = x;
		showDetails();
	}
	
	void showDetails()
	{
		System.out.println("Window "+width+" and "+height);
		Window w1 = new Window();
	}
	
}
public class CreationofObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Window w1 = new Window();
		w1.setWindowDetails(10, 20);
		//w1.showDetails();
		
		Window w2 = new Window();
		//w2.showDetails();

	}

}

