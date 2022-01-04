package com.bestbuy.categories;

import com.bestbuy.testbase.CategoriesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesGetTest extends CategoriesTestBase {
@Test
    public void GetAllCategories(){
    Response response = given()
            .when()
            .get("/categories");
    response.then();//.statusCode(200);
    response.prettyPrint();
}
    @Test
    public void getSingleCategoriesInfo() {
        Response response = given()
                .pathParam("id", "abcat0010000")
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void searchCityOfStore(){
        // HashMap<String,Object> qParams = new HashMap<>();
        Response response = given()
                .queryParam("name", "Gift Ideas")
                //.queryParams(qParams)
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();

    }
}


