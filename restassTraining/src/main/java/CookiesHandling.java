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

public class CookiesHandling {

    @Test(priority = 1)
    public void testCookies() {

        given()
                .when()
                .get("https://google.com/")
                .then()
                //.cookie("AEC", "ARSKqsIxrsjuWprt3lxLR3gsCANTtqWwnRFsum3M9SRduLfLq9xYmnjl_w")
                .log().cookies();
    }

    @Test(priority = 2)
    public void getCookies() {
        Response res = given()
                .when()
                .get("https://google.com/");

        String cookie_value=res.getCookie("AEC");

        Map<String,String> cookies_values=res.getCookies();

        for( String k:cookies_values.keySet()){
           String value=res.getCookie(k);
           System.out.println( k+ "  "+value);
        }

    }

}
