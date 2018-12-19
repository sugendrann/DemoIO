package DemoException;

import java.util.Scanner;

public class ExceptinDemo1 {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;

		try
		{
		int c = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Executed");
		}
		int o = 0;
		while(true)
		{
			o++;
			System.out.println(o);
			if(o==3)
				throw new MyException("Illegal Exception");
		}
		
	}

}

class MyException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String s) {
		System.out.println(s);
	}
}
