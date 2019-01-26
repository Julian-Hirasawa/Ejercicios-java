import java.util.Scanner;
public class Ejercicio4Uso {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Ejercicio4 numerador1;
    numerador1 = new Ejercicio4();
  //  numerador1.setDenominador(3);
  //  numerador1.setNumerador(9);
    System.out.println("Introduce un numerador:");
    numerador1.setNumerador(Integer.parseInt(s.nextLine()));
    System.out.println("Introduce un denominador wey");
    numerador1.setDenominador(Integer.parseInt(s.nextLine()));
    System.out.println(numerador1.toString());
    System.out.println("El resultado de la multiplicacion de " + numerador1.getNumerador() + " por " + numerador1.getDenominador() + " es: " + numerador1.multiplica());
    System.out.println("El resultado de la division de " + numerador1.getNumerador() + " entre " + numerador1.getDenominador() + " es: " + numerador1.divide());
  }
}
