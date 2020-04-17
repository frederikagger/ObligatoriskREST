package home.service;

import home.exceptions.NotFoundException;
import home.model.Vejr;
import home.model.Weather;
import home.repository.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class APIService {

    private RestTemplate restTemplate;
    //private final String api_url;
    private VejrRepository vejrRepository;
    private CloudsRepository cloudsRepository;
    private CoordRepository coordRepository;
    private MainRepository mainRepository;
    private SysRepository sysRepository;
    private WeatherRepository weatherRepository;
    private WindRepository windRepository;

    public APIService(RestTemplate restTemplate, VejrRepository vejrRepository, CloudsRepository cloudsRepository,
                      CoordRepository coordRepository, MainRepository mainRepository, SysRepository sysRepository,
                      WeatherRepository weatherRepository, WindRepository windRepository) {
        this.restTemplate = restTemplate;
        this.vejrRepository = vejrRepository;
        this.cloudsRepository = cloudsRepository;
        this.coordRepository = coordRepository;
        this.mainRepository = mainRepository;
        this.sysRepository = sysRepository;
        this.weatherRepository = weatherRepository;
        this.windRepository = windRepository;
    }

    public Vejr getVejr(String city) {
        String url = "http://api.openweathermap.org/data/2.5/weather?appid=22108afc9470c039cef58b60285ebe8a&q=" + city + "&units=metric";
        Vejr vejr = new Vejr();
        try {
            vejr = restTemplate.getForObject(url, Vejr.class);
        } catch (RuntimeException e) {
            throw new NotFoundException("The city was not found");
        }
        vejrRepository.save(vejr);
        cloudsRepository.save(vejr.getClouds());
        coordRepository.save(vejr.getCoord());
        mainRepository.save(vejr.getMain());
        sysRepository.save(vejr.getSys());
        weatherRepository.saveAll(vejr.getWeather());
        windRepository.save(vejr.getWind());
        return vejr;
    }

}