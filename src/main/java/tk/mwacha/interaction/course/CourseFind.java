package tk.mwacha.interaction.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.entities.Course;
import tk.mwacha.repositories.CourseRepository;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CourseFind {

    private final CourseRepository repository;

    public Course findById(UUID id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Course> findByCategoryId(UUID id) {
        return repository.findByCategoryId(id);
    }


}
