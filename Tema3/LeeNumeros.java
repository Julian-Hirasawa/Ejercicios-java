public class LeeNumeros {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por Favor, introduce un numero: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("introduce otro numero: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int total;
    total = (2 * primerNumero) + segundoNumero;
    
    System.out.println("El primer numero introducido es: " + primerNumero);
    System.out.println("EL segundo numero introducido es: " + segundoNumero);
    System.out.println("EL doblre del primer numero mas el segundo es: " + total);
  }
}
