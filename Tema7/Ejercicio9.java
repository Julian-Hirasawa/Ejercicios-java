import java.util.Scanner;
public class Ejercicio9 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] num = new int[8];

    System.out.println("Introduce 8 numeros y te dire si son par o impar");

    for (int x = 0; x<num.length; x++){
      System.out.println("Introduce un numero:");
      num[x] = Integer.parseInt(s.nextLine());
    }

    for (int x = 0; x < num.length; x++){
      if ( (num[x]%2) == 0){
        System.out.println(num[x] + " Es par.");
      }
      if ( (num[x]%2) != 0){
        System.out.println(num[x] + " Es impar.");
      }
    }



  }
}
