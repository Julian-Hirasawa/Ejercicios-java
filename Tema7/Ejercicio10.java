import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] num = new int[20];

    System.out.println("Genero 20 numero aleatorios:");
    for (int x = 0; x< num.length;x++){
      num[x] = (int)(Math.random()* 20 + 1);
      System.out.print(num[x] + " ");
    }
    System.out.println("");
    int aux1 = 0;
    int aux2 = 0;
    int com = 0;

    for(int x = 19; x >= 0;x--){
      if ( (num[x]%2) == 0){
        aux1 = num[x];


          for (int i = 0; i < x; i++) {

              if ( ((num[i] % 2) != 0) && (com == 0)  ) {
                aux2 = num[i];
                num[i] = aux1;
                num[x] = aux2;
                com = 1;

              }

          }


       com = 0;
      }
    }
    System.out.println("Ahora los numeros par estan ordenados a la derecha y los impares a la derecha");
  for (int x = 0; x < num.length; x++){
    System.out.print(num[x] + " ");
  }
  }
}
