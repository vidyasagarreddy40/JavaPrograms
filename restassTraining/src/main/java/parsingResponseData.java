import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class parsingResponseData {


    @Test(priority = 1)
    public void jsonReponse(){

        given()
                .contentType("ContentType.JSON")
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data[5].first_name",equalTo("Rachel"))
                .log().body();

    }
    @Test(priority = 2)
    public void jsonReponseTwo(){

      Response res= given()
                .contentType("ContentType.JSON")
                .when()
                .get("https://reqres.in/api/users?page=2");

        Assert.assertEquals(res.getStatusCode(),200);
        Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");

        Assert.assertEquals(res.jsonPath().get("data[5].first_name").toString(),"Rachel");

    }

}
