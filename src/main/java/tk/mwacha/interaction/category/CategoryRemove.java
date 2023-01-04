package tk.mwacha.interaction.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.repositories.CategoryRepository;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CategoryRemove {

    private final CategoryRepository repository;

    public void remove (UUID id) {
        final var category = repository.findById(id).orElseThrow();

        repository.delete(category);
    }
}
