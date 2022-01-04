package com.bestbuy.stores;

import com.bestbuy.modelpojo.StoresPojo;
import com.bestbuy.testbase.StoreTestBase;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class StorePatchTest extends StoreTestBase {
    @Test
    public void updateStoreWithPatch(){
        StoresPojo storesPojo = new StoresPojo();
        storesPojo.setAddress2("NorthWatford");


        Response response = given()
                .header("Content-Type","application/json")
                .pathParam("id", 8921)
                .body(storesPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
