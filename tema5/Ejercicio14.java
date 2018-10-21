public class Ejercicio14 {
  public static void main(String[] args){
    
    int base = 0;
    int expontente = 0;
    int total = 1;
    int i = 0;
    System.out.println("Introduce una base y un exponente y te hare la potensia");
    System.out.print("Introduce la base: ");
    base = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduce el exponente:");
    expontente = Integer.parseInt(System.console().readLine());
    
    while ( i < expontente ) {
      i++;
      total *= base;
      
    }
    System.out.println("El resultado es: " + total);
  }
}
    
