package files;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		
		JsonPath js=new JsonPath(loadpayload.CoursePrice());
		int cnt=js.getInt("courses.size()");
		//int purchaseAmt=js.getInt("dashboard.purchaseAmount");
		
		
		System.out.println(cnt);
//purchase amt
		int purchaseamt=js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseamt);
		//print title of first course
		String titlecourse=js.get("courses[0].title");
		System.out.println(titlecourse);
		
		
		for(int i=0;i<cnt;i++) {
			System.out.println(""+js.get("courses["+i+"].title"));
			System.out.println(""+js.getInt("courses["+i+"].price"));
			String coursetitile=js.get("courses["+i+"].title").toString();
			if(coursetitile.equals("RPA")) {
				System.out.println(js.getInt("courses["+i+"].copies"));
				break;
			}
		}
		
		
		}
	
	}

	

