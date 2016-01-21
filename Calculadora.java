
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    //guarda el valor de los multiplos
    private int multiplos;
    //guarda el numero de sumas realizadas;
    private int suma;
    //guarda el numero;
    private int num;
    //guarda el total de la suma
    private int total;
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        multiplos = 10;
        suma = 0;
        num = 0;
    }

    /**
     * Metodo que muestra por pantalla todos los multiplos de 5 del 10 al 95
     */
    public void multiplosOfFive()
    {
        while (multiplos < 90 && multiplos > 5)
        {
            multiplos = multiplos + 5;
            System.out.println(multiplos);
        }
    }
    /**
     * Metodo que suma todos los valores del 0 al 10
     */
    public void sumValues()
    {
        while (suma < 10 )
        {
            num++;
            suma++;
            total = total + num;
        }
        System.out.println(total);
    }
}
