public class Ejercicio33 {
  public static void main(String[] args){
    
    int altura = 0;
    
    System.out.println("Vamos a puntar una U con la altura que tu quieras");
    System.out.print("Introduce de ccuanto quieres que sea la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    
    int base = 0;
    int linea = 0;
    base = ((altura/2) + 1);
    
    while ( linea < altura){
      System.out.print("*");
  for ( int espacios = -1; espacios<altura; espacios++){
    System.out.print(" ");
   }
  
    System.out.print("*"); 
   
   linea++;
    System.out.println();
  }
  System.out.print(" ");
  for ( int i = 0; i<base; i++){
  System.out.print("* ");
  }
}
}
    
