package com.hp.java8;

@FunctionalInterface
interface Calculator {
	public int add(int a, int b);
	//default,static 1.8
	
	 default void m1()
	{
		
	}
	public static void m2()
	{
		
	}
}

public class FunctionalInterfaceEx  implements Calculator{

	public static void main(String[] args) {
		Calculator calci = (a, b) -> a + b;
					System.out.println(calci.add(12,23));
		calci.m1();
		Calculator.m2();
	}
	@Override
	public  void m1()
	{
		
	}
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
//collection
//l  				s   			q
//AL,LL,V,S		HS,LHS,TS		PQ,PBQ