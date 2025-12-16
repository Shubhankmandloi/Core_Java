package com.rays.IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExam {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shubh_w5tpnhe\\OneDrive\\Desktop\\Third.txt"));
		
		String str = br.readLine();
		
		while(str!=null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();

	}

}
