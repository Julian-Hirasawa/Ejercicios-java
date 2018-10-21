public class Ejercicio19 {
  public static void main(String[] args) {
    
    int altura = 0;
    int linea = 0;
    
    
    System.out.println("Vamos a pintar una piramide, introduce la altura, y el caracte con el que se va a pintar");
    System.out.print("Introduce la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el caracter a pintar: ");
    String caracter = System.console().readLine();
    
    int espacios = (altura-1);
    int pintada = 1;
    
    while ( linea < altura ) {
      for ( int x = 0; x < espacios; x++){
        System.out.print(" ");
      }
      for ( int i = 0; i < pintada; i++) {
        System.out.print(caracter);
      }
      System.out.println();
       linea++;
       espacios--;
       pintada += 2;
       
     }
   }
  }
    
