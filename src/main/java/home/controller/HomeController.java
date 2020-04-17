package home.controller;

import home.exceptions.NotFoundException;
import home.model.Vejr;
import home.service.APIService;
import home.service.DBService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private APIService apiService;
    private DBService dbService;

    public HomeController(APIService apiService, DBService dbService) {
        this.apiService = apiService;
        this.dbService = dbService;
    }

    @GetMapping("/")
    public String home(@RequestParam(defaultValue = "copenhagen") String city, Model model){
        model.addAttribute("vejr", apiService.getVejr(city));
        return "index";
    }

    @GetMapping("/historicalData")
    public String history(Model model){
        model.addAttribute("altvejr", dbService.getAllVejrFromDB());
        return "historicalData";
    }

    @GetMapping("/historicalData/{id}")
    public String history(@PathVariable long id, Model model){
        model.addAttribute("vejr", dbService.getVejrByID(id));
        model.addAttribute("weather", dbService.getWeatherByID(id));
        return "detailsHistoricalData";
    }

    @ExceptionHandler(NotFoundException.class)
    public String exceptionHandling(Model model){
        model.addAttribute("message", "404 not found");
        return "exceptionPage";
    }

}
