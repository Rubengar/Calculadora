
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
   
    private int multiplos;
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        multiplos = 10;
    }

    /**
     * 
     */
    public void multiplosOfFive()
    {
        while (multiplos < 90 && multiplos > 5)
        {
            multiplos = multiplos + 5;
            System.out.println(multiplos);
        }
    }
}
