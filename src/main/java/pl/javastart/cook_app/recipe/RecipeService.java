package pl.javastart.cook_app.recipe;

import org.springframework.stereotype.Service;
import pl.javastart.cook_app.category.Category;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RecipeService {
    private List<Recipe> recipes;
    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Object findAll() {
        return recipeRepository.findAll();
    }

    public void likeModification(String type, Long id) {

        Optional<Recipe> recipe = recipeRepository.findById(id);
        if (type == "like"){
          //  recipe.se

        }
    }

//    public String toStringNames(List<Category> categories){
//        return String.join(", ", (CharSequence) categories);
//    }
}
