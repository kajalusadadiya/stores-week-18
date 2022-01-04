package com.bestbuy.stores;

import com.bestbuy.modelpojo.StoresPojo;
import com.bestbuy.testbase.StoreTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StorePostTest extends StoreTestBase{

    @Test
    public void createStore(){
      /*  private String name;"name": "Shine",
            "type": "India",
            "address": "13513 Ridgedale Dr",
            "address2": "",
            "city": "Hopkins",
            "state": "MN",
            "zip": "55305",                    id= 8921
            "lat": 44.969658,                   status code(201)
            "lng": -93.449539
        private String type;
        private String address;
        private String address2;
        private String city;
        private String state;
        private String zip;
        private float lat;*/
        StoresPojo storesPojo = new StoresPojo();
        storesPojo.setName("prime");
        storesPojo.setType("London");
        storesPojo.setAddress("102 ByTheWood");
        storesPojo.setAddress2("");
        storesPojo.setCity("Hopkins");
        storesPojo.setState("MN");
        storesPojo.setZip("55305");
        storesPojo.setLat(44.969658f);
        Response response = given()
                .header("Content-Type","application/json")
                .body(storesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();




    }
}
