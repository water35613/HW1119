package test_p6;

import test_p6.Car;

public class test_p6 
{

	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
        
		car1.num=1280;
		car1.gas=24.84;
		System.out.println("?????O"+car1.num);
		System.out.println("?T?o???O"+car1.gas);
	}

}
 class Car
 {
	 int num;
	 double gas;
 }
