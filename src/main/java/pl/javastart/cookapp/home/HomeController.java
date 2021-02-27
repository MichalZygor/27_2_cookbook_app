package pl.javastart.cookapp.home;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.cookapp.recipe.Recipe;

@Controller
public class HomeController {

    public HomeController() {
    }

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "home/home";
    }

//    @GetMapping("/list")
//    public String list(Model model){
//        model.addAttribute()
//        return "list";
//    }

}
