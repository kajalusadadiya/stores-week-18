package com.bestbuy.services;

import com.bestbuy.testbase.ServicesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesGetTest extends ServicesTestBase {

    @Test
    public void getAllServicesList(){
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
