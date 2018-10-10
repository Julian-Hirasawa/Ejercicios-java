public class Ejercicio14 {
  public static void main(String[] args) {
    
  int a;
    
  System.out.print("Introduce un numero y te dire si es par y/o divisible por 5: ");
  a = Integer.parseInt(System.console().readLine());
  
  if (a%2 == 0) {
    System.out.println("El numero es par");
  } else {
    System.out.println("El numero es impar");
  }
  if (a%5 == 0) {
    System.out.println("EL numero es divisible por 5");
  } else {
    System.out.println("EL numero NO es divisible por 5 >:");
  }
}
}
