package com.bestbuy.stores;

import com.bestbuy.testbase.StoreTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoreDeleteTest extends StoreTestBase {
    @Test
    public void storeWithDelete(){
        Response response = given()
                .pathParam("id", "8921")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
