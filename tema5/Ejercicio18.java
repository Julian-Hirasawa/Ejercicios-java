public class Ejercicio18 {
  public static void main(String[] args){
    
    int inicial = 0;
    int finalN = 0;
    int incremento = 0;
    System.out.println("Introduce un numero inicial y otro final y \n te ponde los numeros intermedios entre estos de 7 en 7");
    System.out.print("Introduce un numero inicial: ");
    inicial = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un numnero final: ");
    finalN = Integer.parseInt(System.console().readLine());
    System.out.print(" " + inicial);
    if ( inicial < finalN) {
      while  ( incremento <= (finalN-7)){
      
      incremento = inicial + 7;
      inicial = incremento;
      System.out.print(" " + incremento);          
      } 
    } else {
      System.out.print("Los  numeros no pueden ser iguales");
    } 
          
  }
}
    
    
