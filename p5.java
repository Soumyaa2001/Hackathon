class P5
{
	public static void areaOfCircle (double r) {

		double res= 3.14d * r * r;
		 System.out.println("Area of circle is " +res);

	}


	public static void areaOfRectangle (int a, int b ) {

		int res= a * b;
		 System.out.println("Area of Rectangle is " +res);

	}

	public static void volOfCylender (double r, int h) {

		double res= 3.14d * r * r * h;
		 System.out.println("Volume of cylender is " +res);

	}




	public static void main(String[] args) {
		 
		 areaOfCircle(3.5d);
		 areaOfRectangle(10,20);
		 volOfCylender(3.5d,10);
		
	}
}