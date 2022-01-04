package com.bestbuy.stores;

import com.bestbuy.testbase.StoreTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoreGetTest extends StoreTestBase {
    @Test
            public void getAllStoresInfo() {
        Response response = given()
                .when()
                .get("/stores");
        response.then();
      /* response.then().statusCode(200);
        response.prettyPrint();*/
    }

    @Test
    public void getSingleStoreInfo(){
        Response response = given()
                .pathParam("id", 6)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void searchCityOfStore(){
       // HashMap<String,Object> qParams = new HashMap<>();
        Response response = given()
                .queryParam("city", "Hopkins")
                //.queryParams(qParams)
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
