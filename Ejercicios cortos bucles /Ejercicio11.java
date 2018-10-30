public class Ejercicio11 {
  public static void main(String[] args){
    
   String palabra = " ";
   String concatenado = " ";
   String salir = " ";
   
   
   while ( ! salir.equals("salir") ) {
   System.out.print("Introduce palabras y te las mostare ordenadas de principio a fin: ");
   palabra = System.console().readLine();
   
   salir = palabra;
   
   if ( ! salir.equals("salir")) {
     concatenado = palabra + " " + concatenado; 
   }
     
   }
    
    System.out.println();
    System.out.print(concatenado);
    
    
  }
}
