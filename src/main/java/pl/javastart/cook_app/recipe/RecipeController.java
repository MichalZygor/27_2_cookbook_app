package pl.javastart.cook_app.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {
        private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("recipes", recipeService.findAll());
        model.addAttribute("recipe", new Recipe());
        return "list";
    }

    @GetMapping("/like")
    public String like(Model model,
                       @RequestParam(required = false, defaultValue = "like") String type,
                       @RequestParam(required = true) Long id){
        recipeService.likeModification(type, id);
        model.addAttribute("recipes", recipeService.findAll());
        model.addAttribute("recipe", new Recipe());
        return "list";
    }

}
