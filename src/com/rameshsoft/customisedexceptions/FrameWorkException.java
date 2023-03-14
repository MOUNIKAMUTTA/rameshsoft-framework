package com.rameshsoft.customisedexceptions;

import java.io.IOException;

public class FrameWorkException extends Exception{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;	
     public  FrameWorkException()
     {
    	super(); 
     }
     public  FrameWorkException(String exceptionMessage)
     {
    	super(exceptionMessage); 
     }
  
  

}
