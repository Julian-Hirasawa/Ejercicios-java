import java.util.Scanner;
public class Ejercicio8 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] temperatura = new int[12];

    System.out.println("Introduce la temperatura media del mes de un año y te lo pondre en una grafica");

    for (int x = 0; x< temperatura.length; x++){
      System.out.println("Introduce la temperatura del mes "+ (x+1) + "º:" );
      temperatura[x] = Integer.parseInt(s.nextLine());
    }
    int pintada = 0;

    System.out.println("Grafico con la media de temperaturas.");
    while( pintada < temperatura.length){
      System.out.print((pintada+1) + ": ");
      for(int x = 0; x < temperatura[pintada]; x++){
        System.out.print("#");

      }
      pintada++;
      System.out.println();
    }

  }
}
