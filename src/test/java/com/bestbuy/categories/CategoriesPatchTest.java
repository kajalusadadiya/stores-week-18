package com.bestbuy.categories;

import com.bestbuy.modelpojo.CategoriesPojo;
import com.bestbuy.testbase.CategoriesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPatchTest extends CategoriesTestBase {
    @Test
    public void UpdateCategoriesWithPatch(){
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setId("abcat0010200");
        categoriesPojo.setName("Lovely Gift");
        Response response = given()
                .header("Content-Type","application/json")
                .body(categoriesPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
