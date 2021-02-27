package pl.javastart.cookapp.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findTop10ByOrderByLikeCountDesc();

    @Query(value = "SELECT * FROM RECIPE  ORDER BY rand() LIMIT 1", nativeQuery = true)
    List<Recipe> findTopByOrderByRand();

}
