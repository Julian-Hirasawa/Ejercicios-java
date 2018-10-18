public class Ejercicio9 {
  public static void main(String[] args){
    
  int numero = 0;
  int digitos = 1;
  int numeroDiv = 0;
  System.out.print("Introduce un numero y te dire cuantas cifras tiene: ");
  numero = Integer.parseInt(System.console().readLine());
  
  while (numero > 10) {
    numero /= 10;
    digitos++;
  }
  System.out.print("El numero introducido tiene un total de " + digitos + " digitos en total");
}
}
