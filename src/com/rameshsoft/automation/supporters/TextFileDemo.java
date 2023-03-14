package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\mouni\\OneDrive\\Desktop\\eclipse programs\\frameworks830pmbatch2023\\src\\com\\rameshsoft\\automation\\supporters\\hello.txt");
		
		boolean status=file.createNewFile();
		if(status)
		{
			System.out.println("file is created newly!");
		}
		else
		{
			System.out.println("returns existing file!");
		}
	
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready())
		{
			String data = br.readLine();
			System.out.println(data);
		}
		br.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//FileWriter fw = new FileWriter(file);
		/*FileWriter fw = new FileWriter(file,true);	
	BufferedWriter bw = new BufferedWriter(fw);
	
	bw.write("hello");
	bw.newLine();
	bw.write("java");
	bw.newLine();
	bw.write("selenium");
	bw.newLine();
	bw.write("job");
	bw.newLine();
	bw.write("hardwork");
	bw.newLine();
	bw.flush();
	bw.close();*/
		
	}

}
