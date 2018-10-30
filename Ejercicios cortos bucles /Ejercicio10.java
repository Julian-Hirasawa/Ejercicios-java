import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args){
    
   Scanner s = new Scanner(System.in);
   String palabra = " ";
   String salida = " ";
   String concatenado = " ";
    
   while  ( !salida.equals("salir") ) {
     System.out.println("Introduce palabras y cuando quieras salir escribe salir");
     palabra = s.nextLine();
     
     salida = palabra;
     if ( ! salida.equals("salir")){
        concatenado += palabra + " ";
      }
     
   }
    System.out.println();
    System.out.print(concatenado);
    
  }
}
