

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class JsonSchemaValidation {

	public static void main(String[] args) {
		JsonPath js = new JsonPath(Payload.jsonResponse());
		
		//1. Print No of courses returned by API
		int countAPI = js.getInt("courses.size()");
		System.out.println("Print No of courses returned by API : "+ countAPI);
		
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Print Purchase Amount : "+ totalAmount);
		
		String title1 = js.get("courses[0].title");
		System.out.println("Print Title of the first course: " +title1);
		
		//4. Print All course titles and their respective Prices
		for(int i=0;i<countAPI;i++) {
			System.out.println(js.get("courses["+i+"].title"));
			System.out.println(js.get("courses["+i+"].price"));
		}
		
		//Print no of copies sold by RPA Course
		for(int i=0;i<countAPI;i++) {
			String courseTitle = js.get("courses["+i+"].title");
			if(courseTitle.equalsIgnoreCase("RPA")) {
				System.out.println("Print no of copies sold by RPA Course: "+js.get("courses["+i+"].copies"));
				break;
			}
		}
		
		//6. Verify if Sum of all Course prices matches with Purchase Amount
		int sum=0;
		for(int i=0;i<countAPI;i++) {
			
			int price = js.get("courses["+i+"].price");
			int copies = js.get("courses["+i+"].copies");
			int amount = price*copies;
			System.out.println("Amount of corses: "+ amount);
			sum= sum+amount;
			
		}
		System.out.println("Total amount: "+ sum);
		Assert.assertEquals(sum, totalAmount, "values are not same!");
		System.out.println("Test Passed!");
		
		
	}

}
