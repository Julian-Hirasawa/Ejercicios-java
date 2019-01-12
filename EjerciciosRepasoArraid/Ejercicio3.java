
import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int tamaño = 0;
    System.out.println("Introduce el tamaño del cual quieres que sea el arraid: ");
    tamaño =  Integer.parseInt(s.nextLine());

    int arraid[] = new int[tamaño];

    for(int x = 0; x < arraid.length; x++){
      System.out.println("Introduce un valor pa rellenar el arraid: ");
      System.out.println("Pos: " + (x+1));
      arraid[x] = Integer.parseInt(s.nextLine());
    }

    System.out.println("Los valores introducidos son:  ");
    for( int x = 0; x < arraid.length; x++){
      if (x < (arraid.length - 1)) {
        System.out.print(arraid[x] + ", ");
      } else {
        System.out.print(arraid[x] + ".");
      }
    }

   int aux = 0;
   int aux1 = 0;
   int pos = tamaño-1;
  // aux = arraid[0];

  for (int x = 0; x <= ((tamaño-1) / 2);x++){
        aux = arraid[x];
        aux1 = arraid[pos];
        arraid[pos] = aux;
        arraid[x] = aux1;
        pos--;

      }
      System.out.println();
      System.out.println("Los valores introducidos de forma inversa son:  ");

      for ( int x = 0; x < arraid.length  ; x++) {
        System.out.println("Posicion: " + (x + 1) + ": " + arraid[x]);
      }


  }
}