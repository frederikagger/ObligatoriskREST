package home.controller;

import home.service.APIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private APIService apiService;

    public HomeController(APIService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("vejr", apiService.getVejr());
        return "index";
    }
}
