package com.hp.streamio;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File file = new File("hp");
		System.out.println(file.exists());
		//System.out.println(file.createNewFile());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.mkdir());
		System.out.println(file.isDirectory());
		
	}

}
