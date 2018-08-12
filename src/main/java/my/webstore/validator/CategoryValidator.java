package my.webstore.validator;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CategoryValidator implements ConstraintValidator<Category, String> {
    private List<String> allowedCategories;

    public CategoryValidator() {
        super();
        this.allowedCategories = new ArrayList<>();
        allowedCategories.add("Smartphone");
        allowedCategories.add("Computer");
        allowedCategories.add("Notebook");
        allowedCategories.add("Laptop");
        allowedCategories.add("Tablet");
        allowedCategories.add("Headphone");
    }

    @Override
    public void initialize(Category constraintAnnotation) {}

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean flag = false;
        OUTER: for (String category : allowedCategories) {
            if (category.equals(value)) {
                flag = true;
                break OUTER;
            }
        }
        return flag;
    }
}
