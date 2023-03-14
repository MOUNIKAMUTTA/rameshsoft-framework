package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.rameshsoft.customisedexceptions.FrameWorkException;

public class PropertiesReader {
	private String filePath;
	private FileInputStream fip;
	private Properties properties;
	private String value;
	
	
	public PropertiesReader(String filePath) throws IOException
	{
		this.filePath=filePath;
		fip = new FileInputStream(filePath);
		
        properties =new Properties();
		properties.load(fip);
		
    }
	public String getValue(String key) throws FrameWorkException
	{
		if(properties!=null)
		{
			value = properties.getProperty(key);
		}
		else
		{
			//throw exceptiom
			System.out.println("properties object is pointing to null");
			 FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
    		 throw exception;
			
		}
		return value;
	}
	public String getValue(String key,String defaultValue) throws FrameWorkException
	{
		if(properties!=null)
		{
			value = properties.getProperty(key);
			if(value==null)
			{
				value=defaultValue;
			}
		}
		else
		{
			//throw exceptiom
			System.out.println("properties object is pointing to null");
			 FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
    		 throw exception;
			
		}
		return value;
	}
	public String getValue(Object key) throws FrameWorkException
	{
		if(properties!=null)
		{
			value =properties.getProperty((String) key);
		}
		else
		{
			//throw exceptiom
			System.out.println("properties object is pointing to null");
			 FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
    		 throw exception;
			
		}
		return value;
	}
	public String getValue(Object key,Object defaultValue) throws FrameWorkException
	{
		if(properties!=null)
		{
			value = (String) properties.getOrDefault(key,defaultValue);
		}
		else
		{
			//throw exceptiom
			System.out.println("properties object is pointing to null");
			 FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
    		 throw exception;
			
		}
		return value;
	}
	public void writeData(String key,String value) throws IOException, FrameWorkException
	{
		if(properties!=null)
		{
			properties.setProperty(key,value);
			FileOutputStream fop = new FileOutputStream(filePath);
			properties.store(fop, "file is saved successfully");
		}
		else
		{
			//throw exceptiom
			System.out.println("properties object is pointing to null");
			 FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
    		 throw exception;
			
		}
	}
	public void writeData(Object key,Object Value) throws IOException
	{
		if(properties!=null)
		{
			properties.put(key,Value);
			FileOutputStream fop = new FileOutputStream(filePath);
			properties.store(fop, "file is saved successfully");
		}
		else
		{
			//throw exceptiom
			System.out.println("properties object is pointing to null");
			
		}
	}
	public void remove(String key,String value) throws IOException, FrameWorkException
	{
		if(properties!=null)
		{
			properties.remove(key,value);
			FileOutputStream fop = new FileOutputStream(filePath);
			properties.store(fop, "file is saved successfully");
		}
		else
		{
			//throw exceptiom
			System.out.println("properties object is pointing to null");
			 FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
    		 throw exception;
			
		}
	}
	public void replace(String key,String value) throws IOException, FrameWorkException
	{
		if(properties!=null)
		{
			properties.replace(key,value);
			FileOutputStream fop = new FileOutputStream(filePath);
			properties.store(fop, "file is saved successfully");
		}
		else
		{
			//throw exceptiom
			System.out.println("properties object is pointing to null");
			 FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
    		 throw exception;
			
		}
	}
	public Set getAllKeys() throws FrameWorkException
	{
		Set setKeys = null;
	if(properties!=null)
	{
		setKeys = properties.keySet();
		
	}
	else
	{
		//throw exceptiom
		System.out.println("properties object is pointing to null");
		 FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
		 throw exception;
		
	}
	return setKeys;
	}
	public Set getAllValues() throws FrameWorkException
	{
		List listValue = new ArrayList();
		Set setKeys = null;
	if(properties!=null)
	{
		setKeys = properties.keySet();
		for(Object object:setKeys)
		{
			String key = (String) object;
			value = properties.getProperty(key);
			
		}
		
	}
	else
	{
		//throw exceptiom
		System.out.println("properties object is pointing to null");
		FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
		 throw exception;
		
	}
	return setKeys;
	}
	public Map getKeysValues() throws FrameWorkException
	{
	  Map mapKeysValues = new HashMap();
	  
	
			Set setKeys = null;
			if(properties!=null)
			{
				setKeys = properties.keySet();
				for(Object object:setKeys)
				{
					String key = (String) object;
				    value=properties.getProperty(key);
				    mapKeysValues.put(key,value);
					
				}	
			
	         }
			else
			{
				//throw exceptiom
				System.out.println("properties object is pointing to null");
				FrameWorkException exception = new FrameWorkException("properties object is pointing to null");
				 throw exception;
				
				
			}
			return mapKeysValues;
	}
		
}
