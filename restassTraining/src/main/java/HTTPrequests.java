import io.restassured.RestAssured;
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

public class HTTPrequests {
    int id;

    @Test(priority = 1)
    public void getuser() {

        baseURI="https://reqres.in/api/";

        given().
                when()
                .get("users?page=2")
                .then()
                .statusCode(200)
                .body("page", equalTo(2))
                .log().all();

    }

    @Test(priority = 2)
    public void createUser() {
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "vidyasagar");
        data.put("job", "software");

        id = given().contentType("application/json")
                .body(data)
                .when()
                .post("https://reqres.in/api/users")
                .jsonPath().getInt("id");

    }

    @Test(priority = 3, dependsOnMethods = {"createUser"})
    public void updateUser() {

        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "vidyasagar");
        data.put("job", "software");

        given().contentType("application/json")
                .body(data)
                .when()
                .put("https://reqres.in/api/users/" + id)
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test(priority = 4, dependsOnMethods = "updateUser")
    public void deleteUser() {
        given()
                .when()
                .delete("https://reqres.in/api/users/" + id)
                .then()
                .statusCode(204)
                .log().all();
    }

    @Test(priority = 5)
    public void createUserJson() {
        JSONObject data = new JSONObject();
        data.put("name", "Reddy");
        data.put("job", "software");

        given()
                .contentType("application/json")
                .body(data.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .log().all();
    }

    @Test(priority = 6)
    public void createUserPojo(){
        Pojo_PostRequest data= new Pojo_PostRequest();
        data.setName("ramireddy");
        data.setJob("Software");

        given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .body("name",equalTo("ramireddy"))
                .header("Content-type","application/json; charset=utf-8")
                .log().all();
    }

    @Test
    public void createUserExternalJsonFile() throws FileNotFoundException {

        File file= new File(".\\body.json");
        FileReader fr= new FileReader(file);
        JSONTokener jt=new JSONTokener(fr);
        JSONObject data=new JSONObject(jt);

        given()
                .contentType("application/json")
                .body(data.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .body("name",equalTo("vidyasasgarreddy"))
                .body("job",equalTo("Automation Engineer"))
                .header("Content-Type","application/json; charset=utf-8")
                .log().all();
    }
}
