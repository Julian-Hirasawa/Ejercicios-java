public class Ejercicio31 {
  public static void main(String[] args) {
    
    int altura = 0;
    int base = 0;
    System.out.println("Vamos a pintar una L por pantalla");
    System.out.print("Introduce la altura de la que quieras que sea la L: ");
    altura = Integer.parseInt(System.console().readLine());
    
    for ( int pintada = 1; pintada < altura; pintada++) {
    System.out.println("*");
    }
    base = ((altura/2) + 1);
    
  for (int x = 0; x<base; x++){
    System.out.print("* ");
  }
    
  }
}
    
