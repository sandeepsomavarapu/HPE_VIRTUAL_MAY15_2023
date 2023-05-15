class Welcome {
	static int countryCode = 91;// static
	int emid = 123;// instance

	public static void main(String args[])// java.lang
	{
		// local variables
		byte marks = 126;
		short result = 9034;
		float salary = 2345.382746234234f;
		double calci = 234.3424234234233;

		System.out.println("welcome to java .....");
		System.out.println(calci + " " + salary + " " + result + " " + marks);

		System.out.println(Welcome.countryCode);

		Welcome wel = new Welcome();

		System.out.println(wel.emid);
	}

}