package com.bestbuy.services;

import com.bestbuy.modelpojo.ServicesPojo;
import com.bestbuy.testbase.ServicesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPostTest extends ServicesTestBase {


    @Test
    public void createNewServices(){
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Mobile Repair");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }

}
