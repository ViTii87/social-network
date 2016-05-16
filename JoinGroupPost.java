
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String nombreGrupo;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String username, String nombreGrupo)
    {
        super(username);
        this.nombreGrupo = nombreGrupo;
    }

    /**
     * Metodo que devuelve el nombre del grupo
     */
    public String getNombreGrupo(){
        return nombreGrupo;
    }
    
    /**
     * Imprime una breve informacion
     */
    public void printShortSummary(){
        System.out.println(getUsername() + " has joined " + nombreGrupo);
    }
}
