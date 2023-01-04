package tk.mwacha.interaction.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.entities.Course;
import tk.mwacha.repositories.CourseRepository;

@RequiredArgsConstructor
@Service
public class CourseUpdate {

    private final CourseRepository repository;

    public void update (Course course) {
        if (repository.existsById(course.getId()))
            repository.save(course);
    }
}
