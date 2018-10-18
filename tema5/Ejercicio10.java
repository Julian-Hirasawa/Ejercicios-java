public class Ejercicio10 {
  public static void main(String[] args) {
    
    int numInt = 0;
    int suma = 0;
    int media = -1;
    int mediaTotal = 0;
    System.out.println("Introduce los numeros que quieras y te hago la media de esos");
    System.out.println("Introduce un numero negativo para terminar");
    
    
    while ( numInt >= 0 ) {
    
    suma += numInt;
    
    System.out.println("Introduce un numero: ");
    numInt = Integer.parseInt(System.console().readLine());
    media++;
    } 
    mediaTotal = (suma / media);
    System.out.println("Has introducido " + media + " numeros");
    System.out.println("La suma de los numeros introducidos es: " + suma);
    System.out.print("Y la media de los numeros introducidos es: " + mediaTotal);
  }
}
    
    
    
