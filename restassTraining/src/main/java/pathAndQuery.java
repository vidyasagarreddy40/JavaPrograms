import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class pathAndQuery {

    @Test
    public void testPathAndQueryParameters(){

        given()
                .pathParam("mypath","users")  //path parameters
                .queryParam("page",2)   //one query parameter
                .queryParam("id",6)   //one query parameter
                .when()
                .get("https://reqres.in/api/{mypath}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
