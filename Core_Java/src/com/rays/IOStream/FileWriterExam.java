package com.rays.IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("C:\\Users\\shubh_w5tpnhe\\OneDrive\\Desktop\\First.txt");
		
		fw.write("Hello Shubhank .\nHow Are You? \nYour age is 26.");
		
		fw.close();
		
		

	}

}
