package tk.mwacha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.mwacha.entities.Category;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
