package tk.mwacha.interaction.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.entities.Category;
import tk.mwacha.repositories.CategoryRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryList {
    private final CategoryRepository repository;

    public List<Category> list() {
        return repository.findAll();
    }
}
