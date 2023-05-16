package com.hp.streamio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("hpemps.txt");
		PrintWriter out = new PrintWriter(fw);
		out.println("sandeep");
		out.println(1234);
		out.println(true);
		out.close();
		fw.close();

	}

}
