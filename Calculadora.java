
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
    /**
     * Metodo que realiza la suma de todos los valores de un valor a otro
     */
    public void sumValuesInterval(int a , int b)
    {
        suma = 0;
        total = 0;
        int num1;
        int num2;
        if (a > b)
        {
           num1 = b;
           num2 = a;
        }
        else
        {
           num1 = a;
           num2 = b;
        }
        if (num1 < 0 || num2 < 0)
        {
            System.out.println("¡¡¡¡¡Error !!!!");
            System.out.println("-1");
        }
        else
        {
            int diferencia = num2 - num1;
            while (suma <= diferencia)
            {
                suma++;
                total = total + num1;
                num1++;
            }
        
        }
        System.out.println(total);
    }
}
