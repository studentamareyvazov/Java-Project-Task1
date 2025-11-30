package pl.edu.vistula.first_project_java_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, in my first Spring controller.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "owner", required = false, defaultValue = "World") String owner, Model model) {
        model.addAttribute("name", owner);
        return "greeting";
    }
}