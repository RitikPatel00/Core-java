package assignment3.date;

public class DateTester {
	public static void main(String[] args) {
        // Test constructors and getters
        Date date1 = new Date(1, 1, 2024);
        System.out.println("Date 1: " + date1);
        System.out.println("Day: " + date1.getDay());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Year: " + date1.getYear());

        // Test setters
        date1.setDay(15);
        date1.setMonth(6);
        date1.setYear(2025);
        System.out.println("Date 1 (updated): " + date1);

        // Test setDate()
        Date date2 = new Date(1, 1, 2024);
        date2.setDate(31, 12, 2023);
        System.out.println("Date 2: " + date2);
    }
}
