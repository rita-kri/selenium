package demo;

class A{
	int a =10;
	private void syso() {
		System.out.println(a + "First method");
	}
	
}

class B{
	void b() {
		System.out.println("second method");
	}
}
public class SwitchExample {

	public static void main(String[] args) {
		
		System.out.println(getMonth("May"));
		System.out.println(getMonth1("May"));
			
		}
	private static  String getMonth(String month) {
		return switch(month) {
		case "January","Februrary","March","April","May" -> "First series of Month";
		
		case "June","July","August" ->"Second series of month";
		default -> "unknown";
		};
	}
	private static  String getMonth1(String month) {
		return switch(month) {
		case "Jan":
			yield "Month";
		case "Feb":
			yield "month";
		case "Mar":
			yield "month";
		
		default :
		yield  "unknown";
		};

}
//	private static  boolean getMonth2(Integer no) {
//		return switch(no) {
//		case 2,4,5,6,7:
//			yield true;
//			break;
//		case 10,15,25:
//			yield true;
//		
//		default :
//		yield throw new IllegalStateException();
//		};
}
