package com.bestbuy.services;

import com.bestbuy.modelpojo.ServicesPojo;
import com.bestbuy.testbase.ServicesTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ServicesPatchTest extends ServicesTestBase {

    @Test
    public void updateServicesWithPatch() {

        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Computers Repairs");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", "26")
                .body(servicesPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
