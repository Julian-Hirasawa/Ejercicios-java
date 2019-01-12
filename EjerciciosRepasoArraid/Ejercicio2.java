import java.util.Scanner;
public class Ejercicio2 {
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
    System.out.println();
    System.out.println("Los valores introducidos de forma inversa son:  ");
    int arraid1[] = new int[tamaño];
    int pos = tamaño - 1;

    for ( int i = 0; i < arraid.length; i++){
      arraid1[i] = arraid[pos];
      pos--;
      if ( i < (arraid.length - 1)){
        System.out.print(arraid1[i]+ ", ");
      } else {
        System.out.println(arraid1[i] + ".");
      }

    }
   }

  }

