package tk.mwacha.interaction.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.entities.Category;
import tk.mwacha.repositories.CategoryRepository;

@RequiredArgsConstructor
@Service
public class CategoryCreation {

    private final CategoryRepository repository;

    public void create(Category category) {
        repository.save(category);
    }
}
