public class Ejercicio1original {
  public static void main(String[] args) {
    String lineaNumero;
    System.out.println("Introduce un numeraco: ");
    lineaNumero = System.console().readLine();
    int numeroUno;
    numeroUno = Integer.parseInt( lineaNumero );
    
    
    System.out.println("Introduce otro numero wey: ");
    lineaNumero = System.console().readLine();
    int numeroDos;
    numeroDos = Integer.parseInt( lineaNumero );
    
    int multiplicacion = numeroUno * numeroDos;
    
    System.out.println("El primer numero introducido es: " + numeroUno);
    System.out.println("El segundo numero introducido es: " + numeroDos);
    System.out.println("La multiplicacion los dos anteriores numeros es: " + multiplicacion );
  }
}
    
