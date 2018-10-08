public class Ejercicio4 {
  public static void main(String[]  args){
    System.out.println("Introduce un numero el cual se va a ser sumado, restado, dividido y multiplicado por otro sigiente numero");
    int numeroUno = Integer.parseInt (System.console().readLine());
    
    System.out.println("Introduce el otro numero");
    int numeroDos = Integer.parseInt (System.console().readLine());
    
    int suma = numeroUno + numeroDos;
    int resta= numeroUno - numeroDos;
    double division = numeroUno / numeroDos;
    int multiplicacion = (int)(numeroUno * numeroDos);
    
    System.out.println("Los resultados serian: ");
    System.out.println("El resuldato de la suma es: " + suma);
    System.out.println("El resultado de la resta es: " + resta);
    System.out.printf("Division %.2f\n", division);
    System.out.println("Multiplicacion: " + multiplicacion);
  }
}
