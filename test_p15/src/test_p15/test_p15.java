package test_p15;

public class test_p15 {

	public static void main(String[] args)
	{
		Car car1;
		car1 =new Car();
		int num=12345;
		double gas =20.55;
		
		car1.setNumGas(num,gas);

	}

}

 class Car
 {
	 int nuum;
	 double gass;
	 void setNumGas(int n,double g)
	 {
		 nuum=n;
		 gass=g;
		 System.out.println("�N�����]��"+nuum+"�A�T�o�q�]��"+gass);
	 }
	 void show()
	 {
		 System.out.println("�����O"+nuum);
		 System.out.println("�T�o�q�O"+gass);
	 }
 }