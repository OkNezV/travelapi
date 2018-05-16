import models.SuggestHotel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Тесты для работы со страницей <Отели>
 * @author Oksana Nezlobina <nez_oksana@mail.ru>
 */
public class HotelPageTestCase {
    private RestTemplate restTemplate;
    private final String api_url = "https://www.onetwotrip.com/";

    @Before
    public void setUp(){
        restTemplate = new RestTemplate();
    }

    @Test
    public void testSuggestRequest(){
        String name = "Moscow"; // наверное лучше бы было сделать через HashMap и все значения передавать из мапы в урл
        int longName = name.length();
        String urlRequest = api_url +
                String.format("_hotels/api/suggestRequest?query=%s&limit=%s&lang=ru&locale=ru&currency=RUB", name, longName);

        SuggestHotel suggestResponse = restTemplate.getForObject(urlRequest, SuggestHotel.class);

        // проверка, что метод suggestRequest вернул код состояния <Успех>
        ResponseEntity<String> response = restTemplate.getForEntity(urlRequest, String .class);
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());

        // проверка, что метод suggestRequest не возвращает ошибки
        Assert.assertEquals(String.format("Метод GET suggestRequest вернул ошибку: %s", suggestResponse.getError()), null, suggestResponse.getError());

        // проверка наличия важных методов
        Assert.assertTrue("Метод result ничего не вернул", !suggestResponse.getResult().isEmpty());
    }
}
