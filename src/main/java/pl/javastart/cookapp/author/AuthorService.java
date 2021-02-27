package pl.javastart.cookapp.author;

import org.springframework.stereotype.Service;
import pl.javastart.cookapp.recipe.Recipe;
import pl.javastart.cookapp.recipe.RecipeRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class AuthorService {
    private List<Author> authors;
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public Object findAll() {
        return authorRepository.findAll();
    }

    public void authorAdd(Author author) {
        authorRepository.save(author);
    }

    public Author findById(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }

    public void authorUpdate(Author author) {
        Author authorFromDb = authorRepository.findById(author.getId()).orElseThrow();
        authorFromDb.setFirstName(author.getFirstName());
        authorFromDb.setLastName(author.getLastName());
        authorRepository.save(authorFromDb);
    }
}
