package pl.javastart.cookapp.category;

import org.springframework.stereotype.Service;
import pl.javastart.cookapp.author.Author;
import pl.javastart.cookapp.author.AuthorRepository;

import java.util.List;

@Service
public class CategoryService {
    private List<Category> categories;
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}

