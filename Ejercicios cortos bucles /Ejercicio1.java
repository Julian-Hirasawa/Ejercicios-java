public class Ejercicio1 {
  public static void main(String[] args){
    
    int numero = 0;
    int x = 0;
    
    System.out.print("Introduce una cantidasd de numeos que quieres introducir: ");
    numero = Integer.parseInt(System.console().readLine());
    
    while ( x < numero ){
      x++;
      System.out.print(x);
      if (x < numero) {
        System.out.print("-");
      }
    }
    
  }
}
