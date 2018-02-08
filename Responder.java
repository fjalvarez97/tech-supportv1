import java.util.ArrayList;
import java.util.Random;
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
        frasesRespuesta.add("Eso suena interesante, cuentame mas...");
        frasesRespuesta.add("No creo que eso sea cierto");
        frasesRespuesta.add("Por favor, no escriba un comentario negativo sobre nosotros");
        frasesRespuesta.add("Un momento, tengo que atender una llamada");
        frasesRespuesta.add("Si me permite hablar…");
        frasesRespuesta.add("¿Ha leído el manual?");
        frasesRespuesta.add("Has cometido un error.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int limiteNums = 8;
        //En este caso es 8 debido a que cogeria un numero aleatorio entre 0 y 8 excluyendo este ultimo, como queremos coger un elemento del array y solo hay 7 nos 
        //valdria para este caso, pero se puede modificar a tu gusto.
        String respuesta = frasesRespuesta.get(numeroAleatorio.nextInt(limiteNums));
        //le decimos que nos coja el string de la coleccion que ocupa el lugar dado por un numero aleatorio entre 0 y el numero que haya en limiteNums-1
        return respuesta;
    }
  
}
