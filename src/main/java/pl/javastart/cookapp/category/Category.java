package pl.javastart.cookapp.category;

import pl.javastart.cookapp.photo.Photo;
import pl.javastart.cookapp.recipe.Recipe;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    //private Long mainPhotoId;

    @ManyToOne
    private Recipe recipe;

    //@OneToOne(cascade = CascadeType.PERSIST)
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Photo mainPhoto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Photo getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(Photo mainPhoto) {
        this.mainPhoto = mainPhoto;
    }
}
