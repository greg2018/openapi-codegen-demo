import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;



public class OffsetDateTimeExample {
	/*
	Parsing of LocalDate query parameters in Spring Boot
	Parsing of OffsetDateTime query parameters in Spring Boot
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2011-12-03T10:15:30+01:00
		OffsetDateTime	offsetDateTime =OffsetDateTime.parse("2011-12-03T10:15:30+01:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println("+++++++offsetDateTime="+offsetDateTime);
		
		
		System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.toString());
	       OffsetDateTime date = OffsetDateTime.parse("2016-10-26T12:00-06:00");
	        System.out.println("+++++++date="+date);
		
		
		ISO xxx=DateTimeFormat.ISO.TIME;
		System.out.println(offsetDateTime);
	} 

}
