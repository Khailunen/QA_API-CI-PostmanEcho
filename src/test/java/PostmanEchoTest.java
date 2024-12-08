
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class PostmanEchoTest {
    @Test
    void postMethod ()  {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("$.[*].id");

    }
}