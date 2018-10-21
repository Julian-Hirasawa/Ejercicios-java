public class Ejercicio20 {
  public static void main(String[] args) {
    
    int altura = 0;
    int linea = 1;
    
    
    System.out.println("Vamos a pintar una piramide, introduce la altura, y el caracte con el que se va a pintar");
    System.out.print("Introduce la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el caracter a pintar: ");
    String caracter = System.console().readLine();
    
    int espacios = (altura-1);
    int espaciosInternos = -1;
    
    while ( linea < altura ) {
      for ( int x = 0; x < espacios; x++){
        System.out.print(" ");
      }
      System.out.print(caracter);
      for ( int i = 0; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      if (linea >= 2) {
        System.out.print(caracter);
      }
     
              
      System.out.println();
       linea++;
       espacios--;
       espaciosInternos +=2;
       
       
     }
      
        for ( int base = 1; base < altura*2; base++){
          System.out.print(caracter);
        }
        
   }
  }
