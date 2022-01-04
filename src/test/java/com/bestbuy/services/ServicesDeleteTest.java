package com.bestbuy.services;

import com.bestbuy.testbase.ServicesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ServicesDeleteTest extends ServicesTestBase {

    @Test
    public void deleteSingleService() {
        Response response = given()
                .pathParam("id", "28")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
