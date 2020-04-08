package home.service;

import home.model.Vejr;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class APIService {

    private RestTemplate restTemplate;
    private final String api_url;

    public APIService(RestTemplate restTemplate, @Value("${api.url") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    public Vejr getVejr() {
        String url = "http://api.openweathermap.org/data/2.5/weather?appid=22108afc9470c039cef58b60285ebe8a&q=Copenhagen&units=metric";
        Vejr vejr = restTemplate.getForObject(url, Vejr.class);
        return vejr;
    }
}
