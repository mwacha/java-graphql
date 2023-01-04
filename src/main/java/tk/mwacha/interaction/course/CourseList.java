package tk.mwacha.interaction.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.entities.Category;
import tk.mwacha.entities.Course;
import tk.mwacha.repositories.CategoryRepository;
import tk.mwacha.repositories.CourseRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseList {
    private final CourseRepository repository;

    public List<Course> list() {
        return repository.findAll();
    }
}
