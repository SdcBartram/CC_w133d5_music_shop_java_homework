import com.bartram.Instruments.Guitar;
import com.bartram.Instruments.Piano;
import com.bartram.Shop.Item;
import com.bartram.Shop.Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Piano piano;
    private Item guitarStrings;
    private Item drumSticks;
    private Item guitarToSell;
    private Item pianoToSell;


    @Before
    public void before() {
        shop = new Shop();
        guitarStrings = new Item("Guitar Strings", 2.0, 4.0);
        drumSticks = new Item("Drum Sticks", 4.0, 8.0);
        guitarToSell = new  Item("Guitar", 100.0, 200.0);
        pianoToSell = new Item("Piano", 500.0, 1000.0);
        guitar = new Guitar("Wood", "Black", 6, guitarToSell);
        piano = new Piano("Wood", "Black", 88, pianoToSell);


    }

    @Test
    public void guitarCanPlaySound() {
        assertEquals("Strumming my pain with his fingers", guitar.play());
    }

    @Test
    public void pianoCanPlaySound() {
        assertEquals("Sing us a song you're the piano man", piano.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(2, guitarStrings.calculateMarkup(), 0.1);
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(guitarStrings);
        shop.addItemToStock(drumSticks);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitarStrings);
        shop.addItemToStock(drumSticks);
        shop.removeItemFromStock(drumSticks);
        assertEquals(1, shop.getStock().size());
    }
}
