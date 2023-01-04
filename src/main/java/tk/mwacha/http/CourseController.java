package tk.mwacha.http;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import tk.mwacha.entities.Course;
import tk.mwacha.interaction.course.CourseCreation;
import tk.mwacha.interaction.course.CourseFind;
import tk.mwacha.interaction.course.CourseList;
import tk.mwacha.interaction.course.CourseRemove;
import tk.mwacha.interaction.course.CourseUpdate;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class CourseController {

    private final CourseFind courseFind;
    private final CourseList courseList;
    private final CourseCreation courseCreation;

    private final CourseRemove courseRemove;

    private final CourseUpdate courseUpdate;

    @QueryMapping
    public Course courseById(@Argument UUID id) {
        return courseFind.findById(id);
    }

    @QueryMapping
    public List<Course> courses() {
        return courseList.list();
    }


    @QueryMapping
    public List<Course> courseByCategoryId(@Argument UUID id) {
        return courseFind.findByCategoryId(id);
    }

    @MutationMapping
    public void createCourse(@Argument Course input) {
        courseCreation.create(input);
    }

    @MutationMapping
    public void updateCourse(@Argument Course input) {
        courseUpdate.update(input);
    }

    @MutationMapping
    public void removeCourse(@Argument UUID id) {
        courseRemove.remove(id);
    }

}
