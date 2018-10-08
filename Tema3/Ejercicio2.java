public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una cantidad en Euros a pasar a Pesetas: ");
    double euros = Double.parseDouble (System.console().readLine());
    
    int conversion = (int)(euros * 166.386);
    System.out.print(euros + " equivaldrian a " + conversion);
    
  
  }
}

