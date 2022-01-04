package com.bestbuy.categories;

import com.bestbuy.modelpojo.CategoriesPojo;
import com.bestbuy.testbase.CategoriesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPutTest extends CategoriesTestBase{

    @Test
    public void UpdateCategoriesWithPut(){
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setId("abcat0020004");
        categoriesPojo.setName("Unique Gifts");
        Response response = given()
                .header("Content-Type","application/json")
                .body(categoriesPojo)
                .when()
                .put();
        response.then().statusCode(200);
        response.prettyPrint();
    }
    }

/*{
        "id": "abcat0010200",
        "name": "Gift Ideas",
        "updatedAt": "2022-01-04T00:33:23.866Z",
        "createdAt": "2022-01-04T00:33:23.866Z"
        }*/