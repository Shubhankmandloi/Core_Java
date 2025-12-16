package com.rays.IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExam {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\shubh_w5tpnhe\\OneDrive\\Desktop\\Third.txt"));
		
		bw.write("Hello User.\nThis is I/O third file.\nIts Buffered Writer Example.");
		
		bw.close();

	}

}
