package cucmbervikashmarch;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeProgram {

	


	    public static void main(String[] args) {
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();
	        System.out.println("Current date: " + currentDate);
	        LocalDate d2= currentDate.plusDays(8);
	        System.out.println("Current date: " + currentDate.plusDays(8));
	   
	        
	        LocalDate date1 = LocalDate.of(2022, 12, 1);
	        LocalDate date2 = LocalDate.of(2024, 1, 1);

	        long daysDiff = ChronoUnit.DAYS.between(date1, date2);
	        long monthsDiff = ChronoUnit.MONTHS.between(date1, date2);
	        long yearsDiff = ChronoUnit.YEARS.between(date1, date2);

	        System.out.println("Days difference: " + daysDiff);
	        System.out.println("Months difference: " + monthsDiff);
	        System.out.println("Years difference: " + yearsDiff);
	     
	        

	        // Get the current time
	        LocalTime currentTime = LocalTime.now();
	        System.out.println("Current time: " + currentTime);

	        // Get the current date and time
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        System.out.println("Current date and time: " + currentDateTime);

	        // Format a LocalDateTime
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
	        String formattedDateTime = currentDateTime.format(formatter);
	        System.out.println("Formatted date and time: " + formattedDateTime);

	        // Parse a date string
	        String dateString = "2022-03-30";
	        LocalDate parsedDate = LocalDate.parse(dateString);
	        System.out.println("Parsed date: " + parsedDate);

	        // Parse a date and time string
	        String dateTimeString = "2022-03-30T10:15:30";
	        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString);
	        System.out.println("Parsed date and time: " + parsedDateTime);
	        
	        parsedDateTime.plusYears(2);
	        System.out.println("Parsed date and time plus year: " + parsedDateTime.plusYears(2));
	        
	        String dateString2 = "01-Jan-2022";
	        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	        LocalDate date = LocalDate.parse(dateString2, formatter2);

	        System.out.println("Parsed date: " + date);
	        
	    }
	}
