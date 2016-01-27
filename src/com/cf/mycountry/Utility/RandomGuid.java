package com.cf.mycountry.Utility;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

public class RandomGuid {
	
	
	  public String getRandomGuid()
	    {
	    	    UUID randomUUID = UUID.randomUUID();
	    		StringBuffer stringBuffer = new StringBuffer();
	    		
	    		String mostSignificantBits = Long.toHexString(randomUUID.getMostSignificantBits());
	    		
	    	    stringBuffer.append(StringUtils.leftPad(mostSignificantBits, 16, '0'));
	    	    
	    	    String leastSignificantBits = Long.toHexString(randomUUID.getLeastSignificantBits());
	    	    stringBuffer.append(StringUtils.leftPad(leastSignificantBits, 16, '0'));
	    	    
	    	  
	    	    return stringBuffer.toString();
	    	  
	      }
	

}
