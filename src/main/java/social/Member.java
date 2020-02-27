package social;

import java.util.*;

public class Member{
    private String fullName;
    private String rank;
    private String username;
    private List<Post> postList;

    public Member(String fullName, String username){
        this.fullName = fullName;
        this.username = username;
    }

    public String getFullName(){
        return fullName;
    }

    public String getRank(){
        return rank;
    }

    public String getUserName(){
        return username;
    }

    public List<Post> getPostList(){
        return postList;
    }
}