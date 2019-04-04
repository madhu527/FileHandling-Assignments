package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {
 
 

	//private static final String  = null;
	public static void main(String[] args) throws IOException {
	//throws IOException {
		/*File file=new File("C:\\Madhu Kiran\\Java Assignment Questions Day1-9\\Assignments");
		System.out.println(file.exits());
		File file=new File("C:\\Madhu Kiran");
		System.out.println(folder.exits());*/
		/*
		 * File file=new File("text.txt"); //System.out.println(file.exists());
		 * if(file.exists()) { file.createNewFile();
		 * System.out.println("file is created succesfully"); }
		 */
		
	 
		//FileWriter writer=new FileWriter(file);
		/*PrintWriter writer=new PrintWriter(new FileWriter(file,true));
		
		 writer.println("hello..\n");
		writer.println("kiran..\n");
		writer.println("kiran..\n");
		writer.println("kiran..\n");
		
		writer.close();
		System.out.println("content has been written succesfully");*/
		/*
		 * FileReader reader=new
		 * FileReader("C:\\Madhu Kiran\\Java Assignments All\\Java Day2 Assignment\\Rectangle"
		 * );
		 * 
		 * BufferedReader bReader =new BufferedReader(reader); PrintWriter writer=new
		 * PrintWriter(new FileWriter(file,true)); String content;
		 */
		/*
		 * while((content=bReader.readLine())!=null) {
		 */
		//System.out.println(content);
		/* writer.println(content);
		 }
		 System.out.println("success");
		 writer.close();
		 bReader.close();
		 reader.close();
		 */
			 
			/* File windowDirectory=new File("c\\window");
			 System.out.println(windowsDirectory.isDirectory());
			 String.content[] */
		 
		 
			 File newDir=new File("myDir");
			 if(newDir.exists());
			 
			 newDir.mkdir();
			 {
			 System.out.println("folder is successfully created");
		 }
 
	File file=new File(newDir, "myfile.txt");
	if(file.exists()) {
		file.createNewFile();
		System.out.println("file is successfully created");
	}
	}
}


		 
		 
		
	  
	



