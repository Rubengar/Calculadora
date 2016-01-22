/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public void testSumValuesInterval()
    {
      Calculadora calculadora1 = new Calculadora();
      boolean nota = true;
      String validator;
      validator = "...ok";
      calculadora1.sumValuesInterval(-1,2);
      calculadora1.sumValuesInterval(0,0);
      calculadora1.sumValuesInterval(1,1);
      calculadora1.sumValuesInterval(2,3);
      calculadora1.sumValuesInterval(6,3);
      calculadora1.sumValuesInterval(1,4);
    
      if (calculadora1.sumValuesInterval(-1,2)!= -1)
      {
        validator = "Error";
      }
      if (calculadora1.sumValuesInterval(0,0)!= 0)
      {
        validator = "Error";
      }
      if (calculadora1.sumValuesInterval(1,1)!= 1)
      {
        validator = "Error";
      }
      if (calculadora1.sumValuesInterval(2,3)!= 5)
      {
        validator = "Error";
      }
      if (calculadora1.sumValuesInterval(6,3)!= 18)
      {
        validator = "Error";
      }
      if (calculadora1.sumValuesInterval(1,4)!=10)
      {
        validator = "Error";
      }
      System.out.println("Comprobando sumValuesInterval(-1,2)...resulatdo correcto -1/resulatado del metodo " + calculadora1.sumValuesInterval(-1,2) + validator);
      System.out.println("Comprobando sumValuesInterval(0,0)...resulatdo correcto 0/resulatado del metodo " + calculadora1.sumValuesInterval(0,0) + validator);
      System.out.println("Comprobando sumValuesInterval(1,1)...resulatdo correcto 1/resulatado del metodo " + calculadora1.sumValuesInterval(1,1) + validator);
      System.out.println("Comprobando sumValuesInterval(2,3)...resulatdo correcto 5/resulatado del metodo " + calculadora1.sumValuesInterval(2,3) + validator);
      System.out.println("Comprobando sumValuesInterval(6,3)...resulatdo correcto 18/resulatado del metodo " + calculadora1.sumValuesInterval(6,3) + validator);
      System.out.println("Comprobando sumValuesInterval(1,4)...resulatdo correcto 10/resulatado del metodo " + calculadora1.sumValuesInterval(1,4) + validator);
     
      if(calculadora1.sumValuesInterval(-1,2)!= -1 || calculadora1.sumValuesInterval(0,0)!= 0|| calculadora1.sumValuesInterval(1,1)!= 1 ||
      calculadora1.sumValuesInterval(2,3)!= 5|| calculadora1.sumValuesInterval(6,3)!= 18|| calculadora1.sumValuesInterval(1,4)!=10)
      {
        nota = false;
        
      }
      if (nota == true)
      {
        System.out.println("El metodo funciona correctamente");
      }
      else
      {
        System.out.println("El metodo no funciona correctamente");
      }
    }
    public void testIsPrime()
    {
      Calculadora calculadora1 = new Calculadora();
      boolean nota = true;
      String validator;
      validator = "...ok";
      calculadora1.isPrime(11);
      calculadora1.isPrime(3);
      calculadora1.isPrime(2);
      calculadora1.isPrime(4);
      calculadora1.isPrime(5);
      calculadora1.isPrime(9);
    
      if (calculadora1.isPrime(11)!= true)
      {
        validator = "Error";
      }
      if (calculadora1.isPrime(3)!= true)
      {
        validator = "Error";
      }
      if (calculadora1.isPrime(2)!= true)
      {
        validator = "Error";
      }
      if (calculadora1.isPrime(4)!= false)
      {
        validator = "Error";
      }
      if (calculadora1.isPrime(5)!= true)
      {
        validator = "Error";
      }
      if (calculadora1.isPrime(9)!= false)
      {
        validator = "Error";
      }
      System.out.println("Comprobando isPrime(11) ...resulatdo correcto true/resulatado del metodo " + calculadora1.isPrime(11) + validator);
      System.out.println("Comprobando isPrime(3)...resulatdo correcto true/resulatado del metodo " + calculadora1.isPrime(3) + validator);
      System.out.println("Comprobando isPrime(2)...resulatdo correcto true/resulatado del metodo " + calculadora1.isPrime(2) + validator);
      System.out.println("Comprobando isPrime(4)...resulatdo correcto false/resulatado del metodo " + calculadora1.isPrime(4) + validator);
      System.out.println("Comprobando isPrime(5)...resulatdo correcto true/resulatado del metodo " + calculadora1.isPrime(5) + validator);
      System.out.println("Comprobando isPrime(9)...resulatdo correcto false/resulatado del metodo " + calculadora1.isPrime(9) + validator);
     
      if(calculadora1.isPrime(11)!= true || calculadora1.isPrime(3)!= true||calculadora1.isPrime(2)!= true ||
      calculadora1.isPrime(4)!= false||calculadora1.isPrime(5)!= true|| calculadora1.isPrime(9)!= false)
      {
        nota = false;
        
      }
      if (nota == true)
      {
        System.out.println("El metodo funciona correctamente");
      }
      else
      {
        System.out.println("El metodo no funciona correctamente");
      }
    
    }
}
