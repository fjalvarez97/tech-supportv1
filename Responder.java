import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String> frasesRespuesta;
    private Random numeroAleatorio;
    private HashMap<HashSet<String>, String> mapRespuestas;
    /**
     * Construct a Responder
     * Crea un objeto de la clase Random y lo guarad en numeroAleatorio,
     * crea un arraylist de String vacio (notacion diamante) y le
     * agregamos varios string
     */
    public Responder()
    {
        numeroAleatorio = new Random();
        frasesRespuesta = new ArrayList<>();
        mapRespuestas = new HashMap<>();
        createDefaultResponse();

        HashSet<String> grupo1 = new HashSet<>();
        grupo1.add("procesador");
        grupo1.add("lento");
        
        HashSet<String> grupo2 = new HashSet<>();
        grupo2.add("bug");
        grupo2.add("fallo");
        
        HashSet<String> grupo3 = new HashSet<>();
        grupo3.add("error");
        grupo3.add("problema");
        
        HashSet<String> grupo4 = new HashSet<>();
        grupo4.add("caro");
        grupo4.add("barato");
        
        mapRespuestas.put(grupo1, "Eso es problema de tu hardware, con un mejor procesador arreglarias tu problema");
        mapRespuestas.put(grupo2, "Nuestro programa tiene bugs que estamos intentando solucionar");
        mapRespuestas.put(grupo3, "Describa su error mas detalladamente");
        mapRespuestas.put(grupo4, "Nuestro programa tiene un precio acorde a los servicios que presta el mismo");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> word)
    {
        String respuesta = null;
        respuesta = mapRespuestas.get(word);
        if (respuesta == null)
        {
            if(frasesRespuesta.size() > 0)
            {
                respuesta = frasesRespuesta.get(0);
                frasesRespuesta.remove(0);
            }
            else 
            {
                respuesta = "No he comprendido su frase.";
            }
        }
        return respuesta;
    }

    public void createDefaultResponse()
    {
        frasesRespuesta = new ArrayList<>();  
        frasesRespuesta.add("Eso suena interesante, cuentame mas...");
        frasesRespuesta.add("No creo que eso sea cierto");
        frasesRespuesta.add("Por favor, no escriba un comentario negativo sobre nosotros");
        frasesRespuesta.add("Un momento, tengo que atender una llamada");
        frasesRespuesta.add("Si me permite hablar…");
        frasesRespuesta.add("¿Ha leído el manual?");
        frasesRespuesta.add("Has cometido un error."); 
    }
}
