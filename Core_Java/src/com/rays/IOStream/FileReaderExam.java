package com.rays.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {

	public static void main(String[] args) throws IOException {
		
		int ch;
		
		FileReader fr = new FileReader("First.txt");
		
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
//		System.out.println();
		
		

	}

}
