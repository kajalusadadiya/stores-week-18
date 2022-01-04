package com.bestbuy.categories;

import com.bestbuy.modelpojo.CategoriesPojo;
import com.bestbuy.testbase.CategoriesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPostTest extends CategoriesTestBase {
    @Test
    public void categoriesWithPost(){
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setId("abcat0010200");
        categoriesPojo.setName("Gift Ideas");
        Response response = given()
                .header("Content-Type","application/json")
                .body(categoriesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
