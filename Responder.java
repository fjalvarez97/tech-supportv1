import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
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
    private HashMap<String, String> mapRespuestas;
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
        frasesRespuesta.add("Eso suena interesante, cuentame mas...");
        frasesRespuesta.add("No creo que eso sea cierto");
        frasesRespuesta.add("Por favor, no escriba un comentario negativo sobre nosotros");
        frasesRespuesta.add("Un momento, tengo que atender una llamada");
        frasesRespuesta.add("Si me permite hablar…");
        frasesRespuesta.add("¿Ha leído el manual?");
        frasesRespuesta.add("Has cometido un error.");
        mapRespuestas.put("despacio", "Eso es problema de tu hardware, con un mejor procesador arreglarias tu problema");
        mapRespuestas.put("bug", "Nuestro programa tiene bugs que estamos intentando solucionar");
        mapRespuestas.put("error", "Describa su error mas detalladamente");
        mapRespuestas.put("caro", "Nuestro programa tiene un precio acorde a los servicios que presta el mismo");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        String respuesta = null;
        respuesta = mapRespuestas.get(word);
        if(respuesta == null)
        {
            respuesta = pickDefaultResponse();
        }
        return respuesta;
    }

    public String pickDefaultResponse()
    {
        int limiteNums = 8;
        String respuesta = frasesRespuesta.get(numeroAleatorio.nextInt(limiteNums));
        return respuesta;
    }
}
