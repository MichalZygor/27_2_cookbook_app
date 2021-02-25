package pl.javastart.cook_app.photo;

import pl.javastart.cook_app.category.Category;
import pl.javastart.cook_app.recipe.Recipe;

import javax.persistence.*;
import java.util.List;

@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String fileName;

    @ManyToOne
    private Recipe recipe;

    @OneToOne(mappedBy = "mainPhoto")
    private Category category;

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
}
