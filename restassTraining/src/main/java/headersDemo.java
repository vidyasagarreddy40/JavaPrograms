import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class headersDemo {

    @Test(priority = 1)
    public void testHeaders() {

        given()
                .when()
                .get("https://google.com/")
                .then()
                .header("Content-Type","text/html; charset=ISO-8859-1")
                .header("Content-Encoding","gzip")
                .header("Server","gws")
                .log().headers();
    }

    @Test(priority = 2)
    public void getHeaders() {
        Response res = given()
                .when()
                .get("https://google.com/");

        String header_value=res.getHeader("Content-Type");

        Headers headers=  res.getHeaders();
        for(Header hd: headers){
            System.out.println(hd.getName()+" "+hd.getValue());
        }



    }
}
