import java.util.ArrayList;
/**
 * Write a description of class PostComments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostComment extends Post
{
    private ArrayList<String> comments;
    
    /**
     * Constructor for objects of class PostComments
     */
    public PostComment(String username)
    {
        super(username);
        comments = new ArrayList<>();
    }

    /**
     * Metodo que añade comentarios
     */
    public void addComment(String text){
        comments.add(text);
    }
}
