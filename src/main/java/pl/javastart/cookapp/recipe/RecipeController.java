package pl.javastart.cookapp.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.cookapp.category.CategoryRepository;
import pl.javastart.cookapp.category.CategoryService;

@Controller
public class RecipeController {
    private RecipeService recipeService;
    private CategoryService categoryService;

    public RecipeController(RecipeService recipeService, CategoryService categoryService) {
        this.recipeService = recipeService;
        this.categoryService = categoryService;
    }

    @GetMapping("/recipe-list")
    public String list(Model model) {
        model.addAttribute("recipes", recipeService.findAll());
        model.addAttribute("recipe", new Recipe());
        return "recipe/list";
    }

    @GetMapping("/recipe-like")
    public String like(Model model,
                       @RequestParam(required = false, defaultValue = "like") String type,
                       @RequestParam(required = true) Long id) {
        recipeService.likeModification(type, id);
        return "redirect:/recipe-list";
    }

    @PostMapping("/recipe-add")   //powinno  być preAdd
    public String recipeAdd(Recipe recipe, Model model) {
        recipeService.addReceiptDefault(recipe);
        model.addAttribute("recipe", recipe);
        return "recipe/edit";
    }

    @GetMapping("/recipe-edit")
    public String recipeEdit(Model model, @RequestParam(required = true) Long id) {
        model.addAttribute("recipe", recipeService.findById(id));
        //model.addAttribute("allCategory", categoryService.findAll());
        return "recipe/edit";
    }

    @PostMapping("/test")
    public String test(@RequestParam(required = false) String sb) {
        System.out.println(sb);
        return "redirect:/recipe-list";
    }

}
