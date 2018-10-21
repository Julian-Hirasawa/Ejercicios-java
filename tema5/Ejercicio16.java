public class Ejercicio16 {
  public static void main(String[] args) {
    
    int numeroMetido;
    
    System.out.print("Introduce un numero y te dire si es primo o no: ");
    numeroMetido = Integer.parseInt(System.console().readLine());
    
    boolean esPrimo = true;
    
    for ( int resto = 2; resto < numeroMetido; resto++) {
      if (( numeroMetido % resto) == 0) {
        esPrimo = false;
      }      
    }
  if (esPrimo) {
    System.out.print("El numero introducido es primo");
  } else {
    System.out.print("EL numero introducido no es primo");
  }
}
}
