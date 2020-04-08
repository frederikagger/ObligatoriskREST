package home.controller;

import home.service.APIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    private APIService apiService;

    public HomeController(APIService apiService) {
        this.apiService = apiService;
    }

    public String home(Model model) {
        model.addAttribute("vejr", apiService.getVejr());
        return "index";
    }
}
