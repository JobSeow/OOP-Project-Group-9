package social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostTest {
    String username = "darylang";
    String fullname = "Daryl Ang Jun Hao";
    Member daryl = new Member(fullname, username);
    @Test
    public void testGetMessage(){
        String msg = "Until now, @evelyn, @adeline, @marilyn's laptops have bitten the dust. See, OOP is tough on laptops as well :/";
        String newMsg = "Until now, evelyn, adeline, marilyn's laptops have bitten the dust. See, OOP is tough on laptops as well :/";
        Post p = new Post(msg,daryl);
        assertEquals(newMsg, p.getMessage());
    }
}