package pl.javastart.cook_app.home;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    public HomeController() {
    }

    @GetMapping("/")
    public String homePage(){

        return "home";
    }

//    @GetMapping("/list")
//    public String list(Model model){
//        model.addAttribute()
//        return "list";
//    }

}
