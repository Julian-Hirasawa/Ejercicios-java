import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  int tamaño = 0;
  boolean repetido = false;
  System.out.println("Introduce el tamaño del arraid: ");
  tamaño = Integer.parseInt(s.nextLine());
  int arraidPos[] = new int[tamaño];
  String arraidPa[] = new String[tamaño];


  for ( int x = 0; x < (tamaño); x++){
    System.out.println("introduce una palabra:");
    arraidPa[x] = s.nextLine();

    System.out.println("introduce su posicion");
    arraidPos[x] = Integer.parseInt(s.nextLine());

   if ( (arraidPos[x] < 0 ) || (arraidPos[x] > tamaño) ) {
      do {
        System.out.println("Vuelve a introducir un numero entre 1 y " + tamaño);
        arraidPos[x] = Integer.parseInt(s.nextLine());


      } while ((arraidPos[x] < 0 ) || (arraidPos[x] > tamaño));
   }
   do {
      repetido = false;
      for ( int i = 0; i<x; i++ ) {
        if (arraidPos[x] == arraidPos[i]) {
          repetido = true;
        }
        if (repetido){
          System.out.println("Introduce un numero que no este repetido: ");
          arraidPos[x] = Integer.parseInt(s.nextLine());

        }
      }
   } while (repetido);
  }
for ( int x = 0; x < tamaño; x++){
  System.out.println(arraidPa[x] + " " + arraidPos[x]);
    }
    int aux = 1;
  for ( int x = (tamaño - 1); x >= 0; x-- ){
    for ( int i = (tamaño - 1); i >= 0; i--){
      if ( aux == arraidPos[i]){
        System.out.println(arraidPa[i]);
        aux++;
      }
    }
  }

  }
}
