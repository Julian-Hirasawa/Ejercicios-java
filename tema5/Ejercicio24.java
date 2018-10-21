public class Ejercicio24 {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    int linea = 0;
    System.out.print("Introduce un numero y te los imprimire en una piramide: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    int espacios = 0;
    espacios = numeroIntroducido - 1;
    int pintada = 1;
    while (linea < numeroIntroducido){
    for (  i = 0; i < espacios; i++){
    System.out.print(" ");
    }
    for (  i = 1; i < pintada; i++) {
      System.out.print(i);
      }
      for ( i = pintada; i > 0; i--) {
        System.out.print(i);
      }
      
     
    System.out.println();
    linea++;
    espacios--;
    pintada++;
    
    
  }
   
}
}
