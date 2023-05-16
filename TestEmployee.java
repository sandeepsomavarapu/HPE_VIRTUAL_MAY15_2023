package com.hp.streamio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		Employee emp = new Employee(123, "suresh", 23456, "hyderabad");
//		FileOutputStream fos = new FileOutputStream("employees.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//		oos.writeObject(emp);//serialization

		FileInputStream fos = new FileInputStream("employees.txt");
		ObjectInputStream oos = new ObjectInputStream(fos);
		Employee emp = (Employee) oos.readObject();
		System.out.println(emp);//de-serialization

	}

}
