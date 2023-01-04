package tk.mwacha.interaction.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.entities.Category;
import tk.mwacha.repositories.CategoryRepository;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CategoryUpdate {

    private final CategoryRepository repository;

    public void update (Category category) {
        if (repository.existsById(category.getId()))
            repository.save(category);
    }
}
