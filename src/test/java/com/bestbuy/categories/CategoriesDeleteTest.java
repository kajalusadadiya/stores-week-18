package com.bestbuy.categories;

import com.bestbuy.testbase.CategoriesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesDeleteTest extends CategoriesTestBase {
    @Test
    public void deleteSingleCategory() {
        Response response = given()
                .pathParam("id", "abcat0010200")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
