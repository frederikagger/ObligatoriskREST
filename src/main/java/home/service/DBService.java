package home.service;

import home.exceptions.NotFoundException;
import home.model.Vejr;
import home.model.Weather;
import home.repository.VejrRepository;
import home.repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {
    private VejrRepository vejrRepository;
    private WeatherRepository weatherRepository;

    public DBService(VejrRepository vejrRepository, WeatherRepository weatherRepository) {
        this.vejrRepository = vejrRepository;
        this.weatherRepository = weatherRepository;
    }

    public List<Vejr> getAllVejrFromDB() {
        return (List<Vejr>) vejrRepository.findAll();
    }

    public Vejr getVejrByID(Long id) {
        return vejrRepository.findById(id).orElseThrow(() -> new NotFoundException("The weather with id="+id+" was not found."));
    }

    public Weather getWeatherByID(Long id) {
        return weatherRepository.findById(id).orElseThrow(() -> new NotFoundException("The weather with id="+id+" was not found."));
    }
}
