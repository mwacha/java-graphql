package tk.mwacha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.mwacha.entities.Course;

import java.util.List;
import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {

    List<Course> findByCategoryId(UUID id);
}
