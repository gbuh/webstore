package my.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome to Web Store!");
        model.addAttribute("tagline", "The one and only amazing web store");
        return "welcome";
    }
/*
    @RequestMapping
    public String welcome(Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("greeting", "Welcome to Web Store!");
        model.addAttribute("tagline", "The one and only amazing web store");
        redirectAttributes.addFlashAttribute("greeting", "Welcome to Web Store!");
        redirectAttributes.addFlashAttribute("tagline", "The one and only amazing web store");
        return "redirect:/welcome/greeting";
    }

    @RequestMapping("/welcome/greeting")
    public String greeting() {
        return "welcome";
    }
*/
}
