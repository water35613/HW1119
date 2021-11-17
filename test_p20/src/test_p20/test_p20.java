package test_p20;

import test_p20.Car;

public class test_p20 
{

	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.num=1280;
		car1.gas=-24;
	
		car1.show();
		
	}

}
 class Car
 {
	 int num;
	 double gas;
	 
	 void show()
	 {
		 System.out.println("car1車號是"+num);
			System.out.println("car1汽油量是"+gas);
		 
	 }
	 
	 
	 
	 
 }
