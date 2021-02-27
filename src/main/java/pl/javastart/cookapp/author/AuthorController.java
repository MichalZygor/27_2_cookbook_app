package pl.javastart.cookapp.author;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.cookapp.recipe.Recipe;
import pl.javastart.cookapp.recipe.RecipeService;

@Controller
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/author-list")
    public String authorList(Model model,
                             @RequestParam(required = false, defaultValue = "") String receiptId) {
        model.addAttribute("authors", authorService.findAll());
        model.addAttribute("receiptId", receiptId);
        return "author/list";
    }

    @GetMapping("/author-add")
    public String authorCreate(Model model,
                            @RequestParam(required = false, defaultValue = "") String receiptId) {
        model.addAttribute("author", new Author());
        model.addAttribute("receiptId", receiptId);
        return "author/add";
    }

    @PostMapping("/author-add")
    public String authorAdd(Author author, Model model,
                            @RequestParam(required = false, defaultValue = "") String receiptId) {
        authorService.authorAdd(author);

        return "redirect:/author-list" + (!receiptId.isEmpty() ? "?receiptId=" + receiptId : "");
    }

    @GetMapping("/author-edit")
    public String authorEdit(Model model,
                               @RequestParam(required = false, defaultValue = "") String receiptId,
                               @RequestParam(required = true) Long id) {
        model.addAttribute("author", authorService.findById(id));
        model.addAttribute("receiptId", receiptId);
        return "author/edit";
    }

    @PostMapping("/author-update")
    public String authorUpdate(Author author, Model model,
                            @RequestParam(required = false, defaultValue = "") String receiptId) {
        authorService.authorUpdate(author);

        return "redirect:/author-list" + (!receiptId.isEmpty() ? "?receiptId=" + receiptId : "");
    }
}
