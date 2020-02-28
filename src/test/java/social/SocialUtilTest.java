package social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class SocialUtilTest {
    SocialUtil su = new SocialUtil();
    Member m1 = new Member("Job Seow", "jobseow");
    Member m2 = new Member("Daryl Ang", "darylang");
    Member m3 = new Member("Li Zhen", "tanlizhen");
    Member m4 = new Member("Tiffany", "tiffanytan");

    @Test
    public void checkFriendshipTest(){
        boolean check1 = su.checkFriendship(m1,m2);
        assertEquals(false, check1);
    }

    @Test
    public void addFriendsTest1(){
        su.addFriends(m1, m2); // add job and daryl as friends
        su.addFriends(m1, m2); // try to add as friends again
        boolean check2 = su.checkFriendship(m1,m2);
        assertEquals(true, check2);
    }

    @Test
    public void addFriendsTest2(){
        su.addFriends(m1, m3); // add lizhen and job as friends
        boolean check3 = su.checkFriendship(m2,m3); // daryl and lizhen should not be friends
        assertEquals(false, check3);
    }

    @Test
    public void broadcastMessageTest(){
        su.addMember(m1);
        su.addMember(m3);
        su.addMember(m4);
        su.addFriends(m1, m3); // add lizhen and job as friends
        Post p = new Post("I love object oriented programming! @jobseow @tiffanytan",m4); // this tagged message should appear on job and tiffany posts
        su.broadcastMessage(p);
        List<Post> jobPosts = m1.getPostList();
        // List<Post> tiffPosts = m4.getPostList();
        assertEquals(jobPosts.size() , 1);
    }
}