import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class SumOfAmountValidation {
	
	@Test
	public void sumOfAllCourses() {
		JsonPath js = new JsonPath(Payload.jsonResponse());
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		int sum =0;
		int count = js.getInt("courses.size()");
		for(int i=0;i<count;i++) {
			int price = js.get("courses["+i+"].price");
			int copies = js.get("courses["+i+"].copies");
			int amount = price*copies;
			System.out.println(amount);
			sum+=amount;
		}
		System.out.println(sum);
		Assert.assertEquals(sum, totalAmount);
		
		
	}

}
