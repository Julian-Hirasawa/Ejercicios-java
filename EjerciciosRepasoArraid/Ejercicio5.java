import java.util.Scanner;
public class Ejercicio5 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int tamaño = 0;
    boolean exacta = false;
    int base = 0;
    do {
      if ( tamaño == 0) {
        System.out.println("Introduce la cantidad de numeros que vas a introducir: ");
        tamaño = Integer.parseInt(s.nextLine());
      } else {
        System.out.println("La cantidad tiene que tener una raiz cuadrada exacta.");
        System.out.println("vuelve a introducir un numero.");
        tamaño = Integer.parseInt(s.nextLine());
      }
      for ( int x = 0; x <= tamaño; x++){
        if ( (x*x) == tamaño ){
          exacta = true;
          base = x;
        }
      }

    } while (!exacta);
    if (exacta){
      int[] arraid = new int[tamaño];
      for ( int x = 0; x < arraid.length; x++ ) {
        System.out.println("Introduce un valor: Pos." + (x+1) );
        arraid[x] = Integer.parseInt(s.nextLine());
      }

      for ( int x = 0; x < arraid.length; x++){
        if (x < (arraid.length -1)) {
          System.out.print(arraid[x] + ", ");
        } else {
          System.out.print(arraid[x] + ".");
        }

      }
      System.out.println();
      int[][] arraidbi = new int[base][base];
      int pos = 0;
      for (int x = 0; x < base; x++){
        for (int i = 0; i < base; i++){
          arraidbi[x][i] = arraid[pos];
          pos++;
        }

      }
      for(int x = 0; x < base; x++){
        for (int i = 0; i < base; i++){

         if (i == (base - 1)){
           System.out.println(arraidbi[x][i]);
          } else {
           System.out.print(arraidbi[x][i] + "  ");
         }

        }
      }
    } else {
      System.out.println("El numero no es una raiz cuadrada");
    }



  }
}
