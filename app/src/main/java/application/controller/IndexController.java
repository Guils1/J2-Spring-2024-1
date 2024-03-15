package application.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model,
        @RequestParam(value = "value", required = false, defaultValue = "Desconhecido") String value
    ) {
        model.addAttribute("message", value != null ? "Hello World " + value + "!" : "Hello World, Desconhecido" + "!");
        return "WEB-INF/index.jsp";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Hello World");
        return "WEB-INF/index.jsp";
    }
}