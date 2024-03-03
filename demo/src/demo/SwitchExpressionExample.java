package demo;

//create switch case by providing the day it has to return weekday or weekend.

public class SwitchExpressionExample {

	public static void main(String[] args) {
		System.out.println(getPrint("Thursday"));


	}
	
	public static String getPrint(String day) {
		return switch(day) {
		case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "weekday";
		case "Saturday","Sunday" -> "weekend";
		default -> "unknown";
		};
	}

}
