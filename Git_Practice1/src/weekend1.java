import java.util.Scanner;

public class weekend1 {

	// method to find out the certain char is contains in a String

	public static boolean test(String str, char c) {
		for (int i = 0; i < str.length(); i++) {
			if (!(str.indexOf(c) < 0)) {
				return true;
			}
		}
		return false;
	}

	// method to find out the certain element contians in a array
	public static boolean test1(int[] arr, int num) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}

	 public static boolean test2(String[] arr, String str) {
		 for(String i : arr) {
			 if(str.equals(i)) {
				 return true;
			 }
		 }
		 return false;
	 }
	 

	///// returning dayNames corresponding to the input number;
	public static String wholeWeek(int day) {
		String dayName = "";
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wensday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day range";
		}
		return dayName;
	}

	// 7. Write a Java program to find the number of days in a month. Go to the
	// editor

	// Test Data
	// Input a month number: 2
	// Input a year: 2016
	// Expected Output :
	// February 2016 has 29 days

	public static String CalendarMonth(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "jan";
			break;
		case 2:
			monthName = "fab";
			break;
		case 3:
			monthName = "mar";
			break;
		case 4:
			monthName = "apl";
			break;
		case 5:
			monthName = "may";
			break;
		case 6:
			monthName = "jun";
			break;
		case 7:
			monthName = "jul";
			break;
		case 8:
			monthName = "aug";
			break;
		case 9:
			monthName = "sep";
			break;
		case 10:
			monthName = "oct";
			break;
		case 11:
			monthName = "nov";
			break;
		case 12:
			monthName = "dec";
			break;
		default:
			monthName = "invalide input";
			break;
		}

		return monthName;
	}
	
	public static String ReturnNames(int num1) {
		String names = "";
		switch(num1) {
		case 3:
			names = "fugazzy"; 
			break;
		case 5:
			names = "fake"; 
			break;
		case 15:
			
			names = "fugazzy fake"; 
			break;
		default:
			names = "invaide input"; 
			break;
			
		}
		return names;
		
		
	}

	public static void main(String[] args) {

		System.out.println(test("qweqwe", 'q'));
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(test1(arr, 6));

		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		System.out.println(wholeWeek(day));

		String str = "Java Exercises!";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(10));
		
		String str1 = "week days and ";
		String str2 = "weekend";
		System.out.println(str1 + str2);
		
		int num1 = input.nextInt(); 
		double num2 = input.nextInt();
		System.out.println(num2/num1);
		System.out.println("this is the return names :" + ReturnNames(num1));
		
		System.out.println("learning the merge command");
	
		
		
		
		
		
		

	}
}
