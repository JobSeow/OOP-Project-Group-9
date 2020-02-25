package social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostTest {
    @Test
    public void testGetMessage(){
        String msg = "Until now, @evelyn, @adeline, @marilyn's laptops have bitten the dust. See, OOP is tough on laptops as well :/";
        String newMsg = "Until now, evelyn, adeline, marilyn's laptops have bitten the dust. See, OOP is tough on laptops as well :/";
        Post p = new Post(msg);
        assertEquals(newMsg, p.getMessage());
    }
}