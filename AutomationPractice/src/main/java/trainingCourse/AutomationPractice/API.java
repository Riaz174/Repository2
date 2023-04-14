package trainingCourse.AutomationPractice;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.AssertParameter;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Response io = get("https://reqres.in/api/users?page=2");//This is code to get response.
//		io.prettyPrint();
//		int status = io.getStatusCode();//This is to get status code.
//		System.out.println(status);
//		Assert.assertEquals(status, 200);//This is Assert class to verify the status code.
//		ResponseBody body = io.getBody();
//		String converttostring = body.asString();// This is to get response body into string format.
//		System.out.println(converttostring);
//		Assert.assertEquals(converttostring.contains("Rachel"), true,"Name is not displaying");
		Post();
	}
	public static void Post() {
		File ot = new File(System.getProperty("user.dir")+"\\House.Jason");
		Response us = (Response) given().contentType(ContentType.JSON).body(ot).post("https://reqres.in/api/users");
		us.prettyPrint();
		System.out.println(us.getStatusCode());
	}
	
	

	}


