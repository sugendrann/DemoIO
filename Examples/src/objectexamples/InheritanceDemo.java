package objectexamples;

class Product
{
	int productid,price;
	String brand;
	Product()
	{
		productid = 1001;
		price = 2000;
		brand = "ABC";
		System.out.println("Product object is constructed");
	}
}

class Mobilephone extends Product
{
	int ram;
	int screensize;
	Mobilephone() {
		ram = 1;
		screensize = 640;
		System.out.println("MobilePhone object is constructed");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Mobilephone();
		
	

	}

}
