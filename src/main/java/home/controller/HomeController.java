package home.controller;

import home.service.APIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

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
}
