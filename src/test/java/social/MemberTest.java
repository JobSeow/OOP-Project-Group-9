package social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemberTest {
    String username = "darylang";
    String fullname = "Daryl Ang Jun Hao";
    Member daryl = new Member(fullname, username);
    @Test
    public void getFullName(){
        assertEquals(fullname, daryl.getFullName());
    }
    @Test
    public void getUsername(){
        assertEquals(username, daryl.getUsername());
    }
}