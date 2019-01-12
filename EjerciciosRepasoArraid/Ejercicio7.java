import java.util.Scanner;
public class Ejercicio7 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int tamaño = 0;
    System.out.println("Intoduce la cantidad de numero a almacenar:");
    tamaño = Integer.parseInt(s.nextLine());
    int[] arraid = new int[tamaño];
    for (int x = 0; x < arraid.length; x++){
      System.out.println("Introduce un valor: Pos." + (x+1) );
      arraid[x] = Integer.parseInt(s.nextLine());
    }
    for ( int x = 0; x < arraid.length; x++){
      if ( x < (arraid.length - 1)) {
        System.out.print(arraid[x] + ", ");
      } else {
        System.out.println(arraid[x] + ".");
      }
    }
    cuadricularVector(arraid);


  }

  public static void cuadricularVector(int[] vector){
    int tamaño = vector.length;
    int base = 0;

    for (int x = 0; x < vector.length; x++){

      if( (x*x) == vector.length ) {
        base = x;

      } else if ( ((x*x) > vector.length) ){
        base = (x-1);
        x = vector.length;
      }

    }
  //  System.out.println("La BASE ES::::!!!!" + base);
    int[][] bidimensional = new int[base][base];
    int pos = 0;
    for (int x = 0; x < base; x++){
      for (int i = 0; i < base; i++){
        bidimensional[x][i] = vector[pos];
        pos++;
        }
      }
      for ( int x = 0; x < base; x++){
        for (int i = 0; i < base; i++){

          System.out.print(bidimensional[x][i] + " ");
          if ( i == (base -1)) {
            System.out.println();
          }
        }
      }
    }
  }

