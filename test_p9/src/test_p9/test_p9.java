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
	
		System.out.println("car1�����O"+car1.num);
		System.out.println("car1�T�o�q�O"+car1.gas);
		
		
	}

}
 class Car
 {
	 int num;
	 double gas;
	 
	 void show()
	 {
		 System.out.println("car1�����O"+num);
			System.out.println("car1�T�o�q�O"+gas);
		 
	 }
	 
	 
	 
	 
 }
