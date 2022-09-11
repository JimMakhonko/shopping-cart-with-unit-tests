package src.test;

import org.junit.Before;
import org.junit.Test;
import src.main.models.Cart;
import src.main.models.Item;

import static org.junit.Assert.*;

public class CartTest {

    Cart cart;

    @Before
    public void setup() {
        cart = new Cart();
        cart.add(new Item("Pepsi", 1.99));
        cart.add(new Item("Crush", 1.99));
    }

    @Test
    public void itemAddedTest(){
        assertTrue(cart.contains(new Item("Crush",1.99)));
    }
}
