import java.util.Scanner;
public class Ejer4Fun {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
  int[] numeros = new int[100];
  int introducido = 0;
  boolean salir = false;
  do {
    System.out.println("Introduce un numero entre 1 y 100:");
    introducido = Integer.parseInt(s.nextLine());
    if ( (introducido >= 0) && (introducido <=100)){
      numeros = arraidRepetidos(introducido, numeros);
    } else if ( introducido == -1){
      salir = true;
    } else {
      System.out.println("El numero no estre 1 y 100");
    }
  } while (!salir);
  mostrarRepetidos(numeros);
  }

  public static int[] arraidRepetidos ( int introducido, int[] numeros){
    numeros[introducido]++;
    return  numeros;
  }
  public static void mostrarRepetidos ( int[] numeros){
    for ( int x = 0; x < numeros.length; x++){
      System.out.println((x+1) + " : ");
      for ( int i = 0; i < numeros[x]; i++){
        System.out.println("69");
      }
    }
  }

}
