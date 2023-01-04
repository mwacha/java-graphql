package tk.mwacha.interaction.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.entities.Course;
import tk.mwacha.repositories.CourseRepository;

@RequiredArgsConstructor
@Service
public class CourseCreation {

    private final CourseRepository repository;

    public void create(Course course) {
        repository.save(course);
    }
}
