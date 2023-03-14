package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rameshsoft.customisedexceptions.FrameWorkException;

public class TestReader {
	private String filePath;
	private File file;
	private FileWriter fileWriter ;
	private BufferedWriter bufferedWriter;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	
	
	public TestReader(String filePath) throws IOException
	{
	this.filePath=filePath;
    file = new File(filePath);
	fileWriter = new FileWriter(file);
    bufferedWriter = new BufferedWriter(fileWriter);
    fileReader = new FileReader(file);
	bufferedReader = new BufferedReader(fileReader);
	
	}
	public void writeData(int data) throws IOException, FrameWorkException {
		if(bufferedWriter!=null)
		{
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
		else
		{
			FrameWorkException exception = new FrameWorkException("bufferedwriter is pointing to null");
			throw exception;
		}
	}
	public void writeData(String data) throws IOException, FrameWorkException {
		if(bufferedWriter!=null)
		{
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
		else
		{
			FrameWorkException exception = new FrameWorkException("bufferedwriter is pointing to null");
			throw exception;
		}
	}
	public String getData() throws IOException, FrameWorkException {
		String data="";
		if(bufferedReader!=null)
		{
			data=bufferedReader.readLine();
		}
		else
		{
			FrameWorkException exception = new FrameWorkException("buffered reader is pointing to null");
			throw exception;
		}
		return data;

	}
	public List<String> getAllData() throws IOException, FrameWorkException {
		List<String> fileData = new ArrayList<String>();
		if(bufferedReader!=null)
		{
			while(bufferedReader.ready())
			{
				String data=bufferedReader.readLine();
				fileData.add(data);
			}
		}
		else
		{
			FrameWorkException exception = new FrameWorkException("buffered reader is pointing to null");
			throw exception;
		}
		return fileData;

	}

}
