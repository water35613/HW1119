package test_p7;

import test_p7.Car;

public class test_p7 
{

	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.num=1280;
		car1.gas=24.84;
		
		Car car2;
		car2=new Car();
		
		car2.num =2222;
		car2.gas =80.779;
		
		System.out.println("car1�����O"+car1.num);
		System.out.println("car1�T�o�q�O"+car1.gas);
		
		System.out.println("car2�����O"+car2.num);
		System.out.println("car2�T�o�q�O"+car2.gas);
	}

}
 class Car
 {
	 int num;
	 double gas;
 }
