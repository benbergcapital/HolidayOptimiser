package com.ben.scraper;

import java.util.HashMap;

public class FlightObject {
	private Double Price;
	private String Date;
	
	
	public FlightObject(String Date, String Price)
	{
		this.Date = Date;
		this.Price = Double.valueOf(Price);		
	}

	
}
