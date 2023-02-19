package com.cogent.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			FileWriter f = new FileWriter("myFile.txt", true);
			f.write("hello world");
			f.close();
			System.out.println("close now");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
