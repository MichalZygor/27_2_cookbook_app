package pl.javastart.cookapp.photo;

import pl.javastart.cookapp.category.Category;
import pl.javastart.cookapp.recipe.Recipe;

import javax.persistence.*;

@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String fileName;

    @ManyToOne
    private Recipe recipe;

//    @OneToOne(mappedBy = "mainPhoto")
//    private Category category;
    @OneToOne(mappedBy = "mainPhoto")
    private Category category;

    @OneToOne(mappedBy = "mainPhotoR")
    private Recipe recipeR;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Recipe getRecipeR() {
        return recipeR;
    }

    public void setRecipeR(Recipe recipeR) {
        this.recipeR = recipeR;
    }
}
