package com.bestbuy.stores;

import com.bestbuy.modelpojo.StoresPojo;
import com.bestbuy.testbase.StoreTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StorePutTest extends StoreTestBase {
@Test
        public void updateStoreWithPut() {
    StoresPojo storesPojo = new StoresPojo();
    storesPojo.setName ("prime123");
    storesPojo.setType("Watford");
    storesPojo.setAddress("102 ByTheWood");
    storesPojo.setAddress2("Harrow");
    storesPojo.setCity("Hopkins");
    storesPojo.setState("MN");
    storesPojo.setZip("55305");
    storesPojo.setLat(44.969658f);
    Response response = given()
            .header("Content-Type", "application/json")
            .body(storesPojo)
            .when()
            .post();
    response.then().statusCode(201);
    response.prettyPrint();
}
}
