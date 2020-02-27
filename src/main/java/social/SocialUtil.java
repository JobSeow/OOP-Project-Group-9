package social;

import java.util.*;

public class SocialUtil{
    public boolean checkFriendship(Member friend1, Member friend2){
        List<Member> friend1List = friend1.getFriendList();
        for (Member friend : friend1List){
            if (friend.getUsername().equals(friend2.getUsername())){
                return true;
            }
        }
        return false;
    }
    public void addFriends(Member friend1, Member friend2){
        if (!checkFriendship(friend1,friend2)){
            friend1.addFriend(friend2);
            friend2.addFriend(friend1);
            System.out.println(friend1.getUsername() + " and " + friend2.getUsername() + " are now friends!");
        } else {
            System.out.println("Already friends!");
        }
    }
}