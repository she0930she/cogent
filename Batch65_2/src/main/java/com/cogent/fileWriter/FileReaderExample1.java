package com.cogent.fileWriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileReader reader = new FileReader("myFile.txt");
	            int character;
	 
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }


	}

}
