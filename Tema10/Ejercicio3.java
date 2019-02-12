import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    System.out.println("Introduce 10 numeros y los ordenare");
    for( int x =0; x < 10; x++){
      System.out.println("Introduce el numero " + (x+1));
      numeros.add(Integer.parseInt(s.nextLine()));
    }
    System.out.println("Los numeros introducidos son: ");
    for (Integer z: numeros
         ) {
      System.out.println(z);
    }
    System.out.println("Los numeros ordenados son: ");
    Collections.sort(numeros);
    for (Integer z: numeros
    ) {
      System.out.println(z);
    }
  }
}
