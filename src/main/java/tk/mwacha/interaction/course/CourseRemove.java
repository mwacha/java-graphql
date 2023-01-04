package tk.mwacha.interaction.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mwacha.repositories.CourseRepository;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CourseRemove {

    private final CourseRepository repository;

    public void remove (UUID id) {
        final var course = repository.findById(id).orElseThrow();

        repository.delete(course);
    }
}
