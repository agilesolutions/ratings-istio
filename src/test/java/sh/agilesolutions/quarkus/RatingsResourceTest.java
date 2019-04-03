package sh.agilesolutions.quarkus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class RatingsResourceTest {

    @Disabled("once responses are working")
    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/ratings")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}