package home.controller;

import home.service.APIService;
import home.service.DBService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HomeControllerTest {

    @Mock
    APIService apiService;
    @Mock
    DBService dbService;
    @Mock
    Model model;
    HomeController homeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        homeController = new HomeController(apiService, dbService);
    }

    @Test
    void home() {
        String view = homeController.home("", model);
        assertEquals("index", view);
    }

    @Test
    void history() {
    }

    @Test
    void testHistory() {
    }

    @Test
    void exceptionHandling() {
    }
}