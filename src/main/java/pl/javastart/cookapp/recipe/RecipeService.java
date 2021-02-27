package pl.javastart.cookapp.recipe;

import org.springframework.stereotype.Service;
import pl.javastart.cookapp.author.Author;
import pl.javastart.cookapp.author.AuthorService;
import pl.javastart.cookapp.category.Category;
import pl.javastart.cookapp.category.CategoryRepository;
import pl.javastart.cookapp.category.CategoryService;
import pl.javastart.cookapp.photo.Photo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class RecipeService {
    private List<Recipe> recipes;
    private RecipeRepository recipeRepository;
//    private CategoryRepository categoryRepository;
    private AuthorService authorService;
    private CategoryService categoryService;
    //private CategoryRepository categoryRepository;


    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Object findAll() {
        return recipeRepository.findAll();
    }

    public void likeModification(String type, Long id) {

        Recipe recipe = recipeRepository.findById(id).orElseThrow();
        if (type.equals("like")) {
            recipe.setLikeCount(recipe.getLikeCount() + 1);
        } else if (type.equals("dislike")) {
            recipe.setDislikeCount(recipe.getDislikeCount() + 1);
        }
        recipeRepository.save(recipe);
    }

    public void addReceiptDefault(Recipe recipe) {
        recipe.setLikeCount((long) 0);
        recipe.setDislikeCount((long) 0);
        recipe.setTotalTimeMin(BigDecimal.valueOf(0));
        recipe.setCreateDate(LocalDate.now());
        recipeRepository.save(recipe);
    }

    public Recipe findById(Long id) {
        return recipeRepository.findById(id).orElseThrow();
    }

    public void update(Recipe recipe) {
        Recipe recipeFromDb = recipeRepository.findById(recipe.getId()).orElseThrow();
        recipeFromDb.setDescription(recipe.getDescription());
        recipeFromDb.setMainPhotoR(recipe.getMainPhotoR());
        recipeFromDb.setTimeDefinition(recipe.getTimeDefinition());
        recipeFromDb.setTitle(recipe.getTitle());
        recipeFromDb.setTotalTimeMin(recipe.getTotalTimeMin());
        recipeFromDb.setUpdateDate(LocalDate.now());
        recipeRepository.save(recipeFromDb);
    }

    public void deleteById(Long id) {
        recipeRepository.deleteById(id);
    }

    public List<Recipe> findTop10() {
        return recipeRepository.findTop10ByOrderByLikeCountDesc();
    }

    public List<Recipe> findRandomOne() {
        return recipeRepository.findTopByOrderByRand();
    }
}
