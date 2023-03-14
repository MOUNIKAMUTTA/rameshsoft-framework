package com.rameshsoft.customisedexceptions;

public class ElementException extends Exception
{
	private static final long serialVersionUID = 1L;	
    public  ElementException()
    {
   	super(); 
    }
    public ElementException(String exceptionMessage)
    {
   	super(exceptionMessage); 
    }
 
 
}
