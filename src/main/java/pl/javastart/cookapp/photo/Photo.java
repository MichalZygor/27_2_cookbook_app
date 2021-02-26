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
