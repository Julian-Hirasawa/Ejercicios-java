import java.util.Scanner;
public class Ejer4 {
  public static  void main(String[] args){
    Scanner s = new Scanner(System.in);
    boolean salir = false;
    int[] numeros = new int[100];
    int introducido = 0;


    for ( int x = 0; x < numeros.length; x++){
      numeros[x] = 0;
    }
    do {
      System.out.println("Introduce un numero:");
      introducido = Integer.parseInt(s.nextLine());
      if ( ( introducido >= 0 ) && ( introducido <= 100)){
        numeros[introducido-1]++;
      } else if (introducido == -1){
        salir = true;
      } else {
        System.out.println("El numero esta fuera del rango, introduce uno entre 0 y 100");
      }

    } while (salir != true);
    for ( int x = 0; x < numeros.length;x++){
      if ( numeros[x] != 0) {
        System.out.print((x+1) + ": ");
        for( int i = 0; i < numeros[x]; i++){
          System.out.print("*");
        }
        System.out.println();

      }
    }
    System.out.println();
  }
}
