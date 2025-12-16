package com.rays.corejava.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\shubh_w5tpnhe\\OneDrive\\Desktop\\second.txt");
		
		int ch;
		while((ch=fr.read())!= -1) {
			System.out.print((char)ch);
		}

	}

}
