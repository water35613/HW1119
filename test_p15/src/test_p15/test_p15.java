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
		 System.out.println("將車號設為"+nuum+"，汽油量設為"+gass);
	 }
	 void show()
	 {
		 System.out.println("車號是"+nuum);
		 System.out.println("汽油量是"+gass);
	 }
 }