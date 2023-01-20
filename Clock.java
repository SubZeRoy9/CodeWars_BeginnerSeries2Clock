import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		System.out.println("Milisecond Time Converter");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds...");
		int sec = scan.nextInt();
		System.out.println("Enter minutes...");
		int min = scan.nextInt();
		System.out.println("Enter Hours");
		int hour = scan.nextInt();
		System.out.println(hour + " hours + " + min + " minutes + " + sec + " seconds = " + Past(hour, min, sec) + " miliseconds");
		

	}
	public static int Past(int h, int m, int s)  {
	    s = s * 1000;
	    m = m * 60000;
	    h = h * 3600000;
	    return s + m + h;
	  }

}
