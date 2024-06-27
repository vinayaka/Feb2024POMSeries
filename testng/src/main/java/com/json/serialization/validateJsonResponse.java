package com.json.serialization;

import org.testng.annotations.Test;


public class validateJsonResponse {

    @Test
    public void validateJsonResponse() {
        // Define base URL
        RestAssured.baseURI = "https://api.example.com";

        // Make API request and validate JSON response
        given()
            .when()
                .get("/users/123")
            .then()
                .statusCode(200)
                .contentType("application/json")
                .body("id", equals(123))
                .body("name", equals("John Doe"))
                .body("email", equals("john.doe@example.com"))
                .body("address.city", equals("New York"))
                .body("address.zipcode", equals("10001"))
                .body("phoneNumbers", hasSize(2))
                .body("phoneNumbers[0].type", equals("home"))
                .body("phoneNumbers[0].number", equals("123-456-7890"))
                .body("phoneNumbers[1].type", equals("work"))
                .body("phoneNumbers[1].number", equals("987-654-3210"));
    }

}
