package social;

// import social.Reply;
import java.util.*;

public class Post{
    private int likes;
    private int dislikes;
    private String message;
    private List<String> taggedUsers = new ArrayList<String>();
    private Member poster;
    // private List<Reply> replies = new ArrayList<Reply>();
    private Date datePosted;

    // constructor
    public Post(String message, Member poster){
        String[] splitMessages = message.split(" ");
        for (int i = 0; i < splitMessages.length; i++){
            String part = splitMessages[i];
            if (part.charAt(0) == '@'){
                String usernameChunk = part.substring(1);
                String username = usernameChunk.split("[^\\w]+")[0];
                // need to check if username exists here!
                taggedUsers.add(username);
                taggedUsers.add(poster.getUsername());
                splitMessages[i] = usernameChunk;
            }
        }
        String finalMessage = String.join(" ", splitMessages);
        this.poster = poster;
        this.message = finalMessage;
        this.datePosted = new Date();
    }
    
    // getters
    public int getLikes(){return likes;}
    public int getDislikes(){return dislikes;}
    public String getMessage(){return message;}
    public Date getDate(){return datePosted;}
    public List<String> getTaggedUsers(){return taggedUsers;}

    // public void addReply(Reply reply){
    //     replies.add(reply);
    // }
    
}