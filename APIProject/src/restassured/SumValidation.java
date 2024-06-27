package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.loadpayload;
import io.restassured.path.json.JsonPath;

public class SumValidation {
	@Test
	public void SumofValue() {
		JsonPath js=new JsonPath(loadpayload.CoursePrice());
		int cnt=js.getInt("courses.size()");
		int sum=0;
		for(int i=0;i<cnt;i++) {
			//System.out.println(""+js.get("courses["+i+"].title"));
			int price=js.getInt("courses["+i+"].price");
			int copies=js.getInt("courses["+i+"].copies");
			sum=sum+price*copies;
			
			}
		int purchaseAmt=js.getInt("dashboard.purchaseAmount");
		System.out.println("===Sum=="+sum+"==purchaseAmt=="+purchaseAmt);
		Assert.assertEquals(purchaseAmt, sum);
	}

}
