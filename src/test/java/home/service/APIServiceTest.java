package home.service;

import home.model.Main;
import home.model.Vejr;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import java.lang.String;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class APIServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(APIServiceTest.class);
    @Autowired
    APIService apiService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getVejr() {
        Vejr vejr = apiService.getVejr();
        assertNotNull(vejr);
        assertEquals(vejr.getMain().getClass(), Main.class);
        assertNotNull(vejr.getMain().getTemp());
        String by = vejr.getName();
        assertEquals(by, "Copenhagen");

    }
}