import java.util.Scanner;
public class EjerecicioB2 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[][] tabla = new int[4][5];
    int[] tFila = new int[4];
    int[] tColumna = new int[5];


    int sumaColumna = 0;
    int sumaFila = 0;
    int sumaTotal = 0;
    int numerosIntroducidos = 0;
    System.out.println("Introduce 20 numeros enteros que seran almacenados en una tabla de 4x5");
    System.out.println("Te hare las sumas parciales de filas y columnas y el Total");

    do{


    for ( int x = 0; x < 4; x++){
      for ( int i = 0; i < 5; i++){
        System.out.print("Introduce el numero para la Fila " + (i+1) + " Columna " + (x+1) + ": " );
        tabla[x][i] = Integer.parseInt(s.nextLine());
        numerosIntroducidos++;
        sumaFila += tabla[x][i];

        if ( i == 4){
          tFila[x] = sumaFila;
          sumaFila = 0;
        }

      }

    }

    } while ( numerosIntroducidos < 20);

    for(int i = 0; i < 5 ; i++){
      for ( int x = 0; x < 4; x++){
        sumaColumna += tabla[x][i];
        if (x == 3){
          tColumna[i] = sumaColumna;
          sumaColumna = 0;
        }
      }

    }
    // sumamos el Total de la tabla.
    for ( int x = 0; x < tFila.length; x++ ){
      sumaTotal += tFila[x];
    }
    for ( int x = 0; x < tColumna.length; x++){
      sumaTotal += tColumna[x];
    }

    for ( int x = 0; x < 4; x++){
      for ( int i = 0; i < 5; i++){
        System.out.printf("%14d", tabla[x][i]);
        if ( i == 4){
          System.out.print("            Fila" + (x+1) + "º: " + tFila[x]);
        }
        if ( ( x == 3) && ( i == 4)){
          System.out.println();
          for( int j = 0; j < 5; j++){
            System.out.print("  Columna " + (j+1) + "º " + tColumna[j]);
            if (j == 4){
              System.out.print("      Total: " + sumaTotal);
            }
          }
        }

      }
      System.out.println();
    }

  }
}
