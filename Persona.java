/**
 * Clase que simula una persona capaz de ingerir alimentos.
 *
 * @author Didac Fernandez Fernandez
 * @version 2018/02/23
 */
public class Persona
{
    // El nombre de la persona
    private String nombre;
    // Indica si es varon
    private boolean esHombre;
    // El peso de la persona en kilogramos
    private int peso;
    // La altura de la persona en centimetros
    private int altura;
    // La edad de la persona en anos
    private int edad;
    // Las calorias ingeridas por la persona
    private int caloriasIngeridas;
    // Las calorias ingeridas por la persona
    private int metabolismoBasal;

    /**
     * Constructor de la clase Persona
     * @param  nombre  El nombre de la persona
     * @param  esHombre  Indica si la persona es de sexo masculino
     * @param  peso  El peso de la persona en kilogramos
     * @param  altura  La altura de la persona en centimetros
     * @param  edad  La edad de la persona en anos
     */
    public Persona(String nombre, boolean esHombre, int peso, int altura, int edad)
    {
        this.nombre=nombre;
        this.esHombre=esHombre;
        this.peso=peso;
        this.altura=altura;
        this.edad=edad;
        caloriasIngeridas = 0;
        if(esHombre){
            metabolismoBasal = (10*peso)+(6*altura)+(5*edad)+5;
        }
        else{
            metabolismoBasal = (10*peso)+(6*altura)+(5*edad)-161;
        }
    }

    /**
     * Metodo que simula la ingesta de una comida indicada por parametro por
     * la persona.
     *
     * @param  comida  La comida que se le da de comer a la persona
     * @return    Las calorias ingeridas en esa comida. -1 si no la ingiere.
     */
    public int comer(Comida comida)
    {
        int caloriasComida = -1;

        if(caloriasIngeridas <= metabolismoBasal){
            caloriasComida = comida.getCalorias();
            caloriasIngeridas += caloriasComida;
        }
        return caloriasComida;
    }

    /**
     * Metodo que obtiene las calorias ingeridas hasta el momento por la persona
     *
     * @return    Las calorias ingeridas hasta el momento
     */
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }

    /**
     * Metodo que simula una pregunta a la persona con respuesta en funcion de
     * su ingesta de calorias hasta el momento. 
     * 
     * Si no ha sobrepasado su metabolismo basal,
     * contesta "SI" o "NO" dependiendo de si la respuesta es divisible por 3.
     * 
     * Si la pregunta contiene el nombre de la persona o esta ha sobrepasado su
     * metabolismo basal contesta con la misma pregunta en mayusculas
     *
     *
     * @param  pregunta  La pregunta que se le hace a la persona
     * @return    La respuesta de la persona
     */
    public String contestar(String pregunta)
    {
        String respuesta = "";

        if(pregunta.contains(nombre) || getCaloriasIngeridas() > metabolismoBasal){
            respuesta = pregunta.toUpperCase();
        }
        else{
            respuesta = (pregunta.length()%3 == 0) ? "SI" : "NO" ;
        }
        System.out.println(respuesta);
        
        return respuesta;
    }
}
