package tk.mwacha.http;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import tk.mwacha.entities.Category;
import tk.mwacha.interaction.category.CategoryCreation;
import tk.mwacha.interaction.category.CategoryFind;
import tk.mwacha.interaction.category.CategoryList;
import tk.mwacha.interaction.category.CategoryRemove;
import tk.mwacha.interaction.category.CategoryUpdate;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryFind categoryFind;
    private final CategoryList categoryList;
    private final CategoryCreation categoryCreation;

    private final CategoryRemove categoryRemove;

    private final CategoryUpdate categoryUpdate;

    @QueryMapping
    public Category categoryById(@Argument UUID id) {
        return categoryFind.findById(id);
    }

    @QueryMapping
    public List<Category> categories() {
        return categoryList.list();
    }

    @MutationMapping
    public void createCategory(@Argument Category input) {
        categoryCreation.create(input);
    }

    @MutationMapping
    public void updateCategory(@Argument Category input) {
        categoryUpdate.update(input);
    }

    @MutationMapping
    public void removeCategory(@Argument UUID id) {
        categoryRemove.remove(id);
    }

}
