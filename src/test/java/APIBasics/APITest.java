package APIBasics;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class APITest{

    @Test
    public void verifyResponse(){
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        Response response = RestAssured.given().get("");
        Headers allHeaders = response.headers();
        ResponseBody body = response.getBody();
        System.out.println("Response Body is: " + body.asString());
        for(Header header : allHeaders) {
            System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
            //assert(header.getName() == header.getValue());
        }
    }
}