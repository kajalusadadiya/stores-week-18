package com.bestbuy.products;

import com.bestbuy.testbase.ProductsTestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductsDeleteTest extends ProductsTestBase {

    @Test
    public void deleteSingleProduct() {
        Response response = given()
                .pathParam("id", "9999687")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}
