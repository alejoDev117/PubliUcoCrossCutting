package co.edu.uco.crosscutting.utils;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

public final class UtilDateTime {
	
	private static final String DEFAULT_VALUE_DATE_AS_STRING ="01/01/0001 00:00:00"; 
	private static final String DEFAULT_VALUE_LOCALTIME_AS_STRING ="00:00:00";
	private static final String FORMAT_VALUE_LOCALTIME = "HH:mm:ss";
	private static final String FORMAT_VALUE_DATE = "dd/MM/yyyy HH:mm:ss";
	private static final Date DEFAULT_VALUE_DATE = fromStringToDate(DEFAULT_VALUE_DATE_AS_STRING);
	private static final LocalTime DEFAULT_VALUE_LOCALTIME = fromStringToLocalTime(DEFAULT_VALUE_LOCALTIME_AS_STRING);
	
	private  UtilDateTime() {
		super();
	}
	
	
	
	
	public static final Date fromStringToDate(final String dateValue){
        DateFormat format = new SimpleDateFormat(FORMAT_VALUE_DATE); 
        Date dateTime = null;
        try {
            dateTime = format.parse(UtilText.getDefault(dateValue, DEFAULT_VALUE_DATE_AS_STRING)); 
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return dateTime;
	}

	
	public static final LocalTime fromStringToLocalTime(final String localDateValue) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_VALUE_LOCALTIME);
        LocalTime localTime = LocalTime.parse(UtilText.getDefault(localDateValue, DEFAULT_VALUE_LOCALTIME_AS_STRING), formatter);
        return localTime;
	}
	




	public static final String getDefaultValueDateAsString() {
		return DEFAULT_VALUE_DATE_AS_STRING;
	}




	public static final String getDefaultValueLocaltimeAsString() {
		return DEFAULT_VALUE_LOCALTIME_AS_STRING;
	}




	public static final String getFormatValueLocaltime() {
		return FORMAT_VALUE_LOCALTIME;
	}




	public static final String getFormatValueDate() {
		return FORMAT_VALUE_DATE;
	}




	public static final Date getDefaultValueDate() {
		return DEFAULT_VALUE_DATE;
	}

	
	
	public static final Date getDefaultDate(final Date dateValue) {
		return UtilObject.isNull(dateValue) ? DEFAULT_VALUE_DATE : dateValue;
	}
	
	
	
	public static final LocalTime getDefaultLocalTime(final LocalTime localTime) {
		return UtilObject.isNull(localTime) ? DEFAULT_VALUE_LOCALTIME : localTime;
	}

	
	
	


	public static final LocalTime getDefaultValueLocaltime() {
		return DEFAULT_VALUE_LOCALTIME;
	}

	
	
	
	
	
}
