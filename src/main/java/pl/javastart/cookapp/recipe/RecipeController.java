package pl.javastart.cookapp.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.cookapp.author.Author;
import pl.javastart.cookapp.author.AuthorService;
import pl.javastart.cookapp.category.Category;
import pl.javastart.cookapp.category.CategoryRepository;
import pl.javastart.cookapp.category.CategoryService;
import pl.javastart.cookapp.photo.Photo;
import pl.javastart.cookapp.photo.PhotoService;

@Controller
public class RecipeController {
    private RecipeService recipeService;
    private CategoryService categoryService;
    private PhotoService photoService;
    private AuthorService authorService;

    public RecipeController(RecipeService recipeService, CategoryService categoryService, PhotoService photoService,
                            AuthorService authorService) {
        this.recipeService = recipeService;
        this.categoryService = categoryService;
        this.photoService = photoService;
        this.authorService = authorService;
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
        model.addAttribute("allCategory", categoryService.findAll());
        model.addAttribute("allPhotos", photoService.findAll());
        model.addAttribute("allAuthors", authorService.findAll());
        return "recipe/edit";
    }

    @GetMapping("/recipe-edit")
    public String recipeEdit(Model model, @RequestParam(required = true) Long id) {
        model.addAttribute("recipe", recipeService.findById(id));
        model.addAttribute("allCategory", categoryService.findAll());
        model.addAttribute("allPhotos", photoService.findAll());
        model.addAttribute("allAuthors", authorService.findAll());
        return "recipe/edit";
    }


    @PostMapping("/test")
    public String test(@RequestParam(required = false) String sb) {
        System.out.println(sb);
        return "redirect:/recipe-list";
    }

    @PostMapping("/recipe-update")
    public String recipeUpdate(Recipe recipe, Model model, @RequestParam(required = false) String buttonFor) {
        recipeService.update(recipe);
        if (buttonFor.equals("aEdit")) {
            return "redirect:/author-list?receiptId=" + recipe.getId();
        } else {
            model.addAttribute("recipe", recipe);
            return "recipe/edit";
        }
    }

    @GetMapping("/recipe-delete")
    public String recipeDelete(Model model, @RequestParam(required = true) Long id) {
        recipeService.deleteById(id);
        model.addAttribute("recipes", recipeService.findAll());
        model.addAttribute("recipe", new Recipe());
        return "recipe/list";
    }

    @GetMapping("/recipe-view")
    public String recipeView(Model model, @RequestParam(required = true) Long id) {
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("recipeView", recipeService.findById(id));
        return "recipe/view";
    }

    @GetMapping("/top")
    public String listTop(Model model) {
        model.addAttribute("recipes", recipeService.findTop10());
        model.addAttribute("recipe", new Recipe());
        return "recipe/list";
    }

    @GetMapping("/blind-shot")
    public String listBlindShot(Model model) {
        model.addAttribute("recipes", recipeService.findRandomOne());
        model.addAttribute("recipe", new Recipe());
        return "recipe/list";
    }
}
