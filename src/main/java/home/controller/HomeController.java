package home.controller;

import home.model.Vejr;
import home.service.APIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private APIService apiService;

    public HomeController(APIService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/")
    public String home(@RequestParam(defaultValue = "copenhagen") String city, Model model){
        model.addAttribute("vejr", apiService.getVejr(city));
        return "index";
    }

    @GetMapping("/historicalData")
    public String history(Model model){
        model.addAttribute("altvejr", apiService.getAllVejrFromDB());
        return "historicalData";
    }

    @GetMapping("/historicalData/{id}")
    public String history(@PathVariable long id, Model model){
        model.addAttribute("vejr", apiService.getVejrByID(id));
        model.addAttribute("weather", apiService.getWeatherByID(id));
        return "detailsHistoricalData";
    }

}
