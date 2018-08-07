package my.webstore.exception;

public class ProductNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 6181969859521130333L;

    private String productId;

    public ProductNotFoundException(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }
}
