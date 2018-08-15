package my.webstore.exception;

public class InvalidCartException extends RuntimeException {

    private static final long serialVersionUID = -2536215231779591862L;

    private String cartId;

    public InvalidCartException(String cartId) {
        this.cartId = cartId;
    }

    public String getCartId() {
        return cartId;
    }
}
