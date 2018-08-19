package my.webstore.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public final class CartItemTest {

    private CartItem cartItem;

    @Before
    public void setup() {
        cartItem = new CartItem("1");
    }

    @Test
    public void cartItemTotalPriceEqual() {
        // Arrange
        Product iphone = new Product("P1237", "iPhone 5s", new BigDecimal(500));
        cartItem.setProduct(iphone);
        // Act
        BigDecimal totalPrice = cartItem.getTotalPrice();
        // Assert
        Assert.assertEquals(iphone.getUnitPrice(), totalPrice);
    }
}
