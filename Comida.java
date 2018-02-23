
/**
 * Clase que simula una comida.
 *
 * @author Didac Fernandez Fernandez
 * @version 2018/02/23
 */
public class Comida
{
    // El nombre de la comida
    private String nombre;
    // El numero de calorias
    private int calorias;

    /**
     * Constructor de la clase Comida
     * @param  nombre  El nombre de la comida
     * @param  calorias  El numero de calorias asociadas a la comida
     */
    public Comida(String nombre, int calorias)
    {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    /**
     * @return    El nombre de la comida
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @return    Las calorias de la comida
     */
    public int getCalorias()
    {
        return calorias;
    }
}
