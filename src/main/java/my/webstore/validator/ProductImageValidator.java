package my.webstore.validator;

import my.webstore.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductImageValidator implements Validator {

    private long allowedSize = 500_000L;

    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;

        if (product.getProductImage() != null
                && product.getProductImage().getSize() > allowedSize) {
            errors.rejectValue("productImage",
                    "my.webstore.validator.ProductImageValidator.message");
        }
    }
}
