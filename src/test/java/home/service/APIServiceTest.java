package home.service;

import home.model.Main;
import home.model.Vejr;
import home.model.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.String;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class APIServiceTest {

    @Autowired
    APIService apiService;
    DBService dbService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getVejr() {
        Vejr vejr = apiService.getVejr("Copenhagen");
        assertNotNull(vejr);
        assertEquals(vejr.getMain().getClass(), Main.class);
        assertNotNull(vejr.getMain().getTemp());
        String by = vejr.getName();
        assertEquals(by, "Copenhagen");
        assertNotNull(vejr.getMain().getFeels_like());
    }

    @Test
    void getVejrByID(){
        Vejr vejr = dbService.getVejrByID((long) 1);
        assertNotNull(vejr);
        assertEquals(32, vejr.getClouds().getAll());
        Weather weather = dbService.getWeatherByID((long) 1);
        assertEquals("03d", weather.getIcon());
    }
}