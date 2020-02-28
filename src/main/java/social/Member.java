package social;

import java.util.*;

public class Member{
    private String fullName;
    private String rank;
    private String username;
    private List<Post> postList = new ArrayList<Post>();
    private List<Member> friendList = new ArrayList<Member>();

    public Member(String fullName, String username){
        this.fullName = fullName;
        this.username = username;
    }

    //getters
    public String getFullName(){return fullName;}
    public String getRank(){return rank;}
    public String getUsername(){return username;}
    public List<Post> getPostList(){return postList;}
    public List<Member> getFriendList(){return friendList;}

    //methods 
    public void addFriend(Member friend){
        friendList.add(friend);
    }
    public void addPost(Post post){
        postList.add(post);
        if (postList.size() > 5){
            postList.remove(0);
        }
    }
}