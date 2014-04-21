package com.ben.scraper;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Main m = new Main();
		m.Start();
		
	}
	
	private void Start()
	{
		SkyScannerScrape s = new SkyScannerScrape();
		BookingScrape B = new BookingScrape();
		
		Calendar StartDate = new GregorianCalendar(2014,7,14);
		int Duration = 7; //no. days
		int Variance = 7; //Number of days after start day to check prices
		
		List<FlightObject> _ListOfFlightQuotes = new ArrayList<FlightObject>();
		List<HotelObject> _ListOfHotelQuotes = new ArrayList<HotelObject>();
		_ListOfFlightQuotes = s.ScrapeScanner(StartDate,Duration,Variance);
		_ListOfHotelQuotes = B.ScrapeHotels(StartDate,Duration,Variance);
		
		
		
		
		
		
		
		
		
		
	
		 // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
    /*    WebDriver driver = new HtmlUnitDriver();

        // And now use this to visit Google
        driver.get("http://www.booking.com");

        // Find the text input element by its name
        WebElement _Destination = driver.findElement(By.name("ss"));
        Select _ChkInDay = new Select(driver.findElement(By.name("checkin_monthday")));
        Select _ChkOutDay = new Select(driver.findElement(By.name("checkout_monthday")));
        Select _ChkInMonth = new Select(driver.findElement(By.name("checkin_year_month")));
        Select _ChkOutMonth = new Select(driver.findElement(By.name("checkout_year_month")));
   //     WebElement _StarRating = new Select(driver.findElement(By.name("hotel_star_rating")));
      //  Select _ReviewScoreGood = new Select(driver.findElement(By.name("hotel_review_score")));
       // Select _ReviewScoreSuperb = new Select(driver.findElement(By.name("hotel_review_score")));
        // Enter something to search for
       
      
    	Calendar calendar = new GregorianCalendar(2014,7,15);
    	Calendar calendar_out = new GregorianCalendar(2014,7,15);
        
        
        
        _ChkInDay.selectByValue(Integer.toString(calendar.get(Calendar.DAY_OF_MONTH)));
        _ChkInMonth.selectByValue(Integer.toString(calendar.get(Calendar.YEAR))+"-"+Integer.toString(calendar.get(Calendar.MONTH)));
      
        
        
        calendar_out.add(Calendar.DAY_OF_MONTH,7); 
        
        _ChkOutDay.selectByValue(Integer.toString(calendar_out.get(Calendar.DAY_OF_MONTH)));
        _ChkOutMonth.selectByValue(Integer.toString(calendar_out.get(Calendar.YEAR))+"-"+Integer.toString(calendar_out.get(Calendar.MONTH)));
        _Destination.sendKeys("Faro");
    //    _StarRating.selectByVisibleText("4 stars");
        // Now submit the form. WebDriver will find the form for us from the element
        _Destination.submit();

        // Check the title of the page
        System.out.println(driver.getCurrentUrl());
     //   System.out.println("Page title is: " + driver.getPageSource());

        WebElement _DisambigDestination = driver.findElement(By.className("destination_name"));
        String link = _DisambigDestination.getAttribute("href");
       
        //filters for WIFI, 4star and sorts by Price for double room.
    //    driver.get(link+";nflt=hotelfacility%3D96%3Bclass%3D4%3B;unchecked_filter=facilities;order=price_for_two");
       */
		
	}
         

	}
	
	