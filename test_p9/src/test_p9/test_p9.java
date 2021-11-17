package test_p9;

import test_p9.Car;

public class test_p9 
{

	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.num=1280;
		car1.gas=24.84;
	
		System.out.println("car1車號是"+car1.num);
		System.out.println("car1汽油量是"+car1.gas);
		
		
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
