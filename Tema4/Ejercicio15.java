public class Ejercicio15 {
  public static void main(String[] args) {
    
    
    System.out.print("Intoduce el caracter del que quieres que sea la piramide: ");
    String a = System.console().readLine();
    System.out.println("Ahora introduce donde quieres que tenga el vertice la piramide");
    System.out.println("1. Si quieres el vertice hacia arriba: ");
    System.out.println("2. Si quieres el vertice hacia abajo: ");
    System.out.println("3. Si quieres el vertice hace la izquierda: ");
    System.out.print("4. Si quieres el vertice hacia la derecha: ");
    int vertice = Integer.parseInt(System.console().readLine());
    
    switch (vertice) {
      case 1:
      System.out.println(" " + " " + " "+ a);
      System.out.println(" " + " "+ a + a);
      System.out.println(a + a + a + a + a);
      break;
      case 2:
      System.out.println(a + a + a + a);
      System.out.println(" " + " " + a + a);
      System.out.println(" " + " " + " "  + a);
      break;
      case 3:
      System.out.println(" " + " " + " " + " " + a);
      System.out.println(a + a + a);
      System.out.println(" " + " " + " " + " " + a);
      break;
      case 4:
      System.out.println(a);
      System.out.println(a + a + a);
      System.out.println(a);
      break;
      default:
      System.out.println("No has introducido un numero correcto");
    }
  }
}
      
      
      
      
      
