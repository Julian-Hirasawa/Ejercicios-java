public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Introduce una cantidad en pesetas para convertirla a euros: ");
    int pesetas = Integer.parseInt(System.console().readLine());
    
    double conversion = pesetas / 166.386;
    System.out.printf("%d pesetas son %.2f euros.",pesetas, conversion);
  }
}

