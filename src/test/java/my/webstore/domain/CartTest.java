package my.webstore.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CartTest {

    List<CartItem> cartItems;
    private Cart cart;

    @Before
    public void setup() {
        cartItems = new ArrayList<>();
        cart = new Cart("1");
    }

    @Test
    public void testGetGrandTotal() {
        // Arrange
        Product iphone = new Product("P1237", "iPhone 5s", new BigDecimal(500.17));
        CartItem cartItem1 = new CartItem("1");
        cartItem1.setProduct(iphone);
        cartItem1.setQuantity(2);
        Product laptop = new Product("P1238", "Dell", new BigDecimal(601.98));
        CartItem cartItem2 = new CartItem("2");
        cartItem2.setProduct(laptop);
        cartItem2.setQuantity(0);
        Product tablet = new Product("P1239", "Nexus 7", new BigDecimal(333.33));
        CartItem cartItem3 = new CartItem("3");
        cartItem3.setProduct(tablet);
        cartItem3.setQuantity(99999);
        cartItems.add(cartItem1);
        cartItems.add(cartItem2);
        cartItems.add(cartItem3);
        cart.setCartItems(cartItems);
        // Act
        BigDecimal grandTotal = cart.getGrandTotal();
        // Assert
        Assert.assertEquals((cartItem1.getTotalPrice().add(cartItem3.getTotalPrice())), grandTotal);
    }
}
