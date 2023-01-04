package tk.mwacha.interaction.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.entities.Category;
import tk.mwacha.repositories.CategoryRepository;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CategoryFind {

    private final CategoryRepository repository;

    public Category findById(UUID id) {
        return repository.findById(id).orElseThrow();
    }

}
