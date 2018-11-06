import java.util.Scanner;
public class Ejercicio5 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int[] num = new int[10];
    for(int x = 0; x < num.length; x++){
      System.out.println("Introduce un numero: ");
      num[x] = Integer.parseInt(s.nextLine());
    }

    int maximo = 0;
    int minimo = 999999999;
      for(int i = 0; i< num.length; i++){

        if (num[i] > maximo) {
          maximo = num[i];
        }
        if (num[i] < minimo){
          minimo = num[i];
        }
      }
      for (int i = 0; i<num.length;i++){
        if (num[i] == maximo){
          System.out.println("El valor " + (i+1) + " introducido, con el numero " + num[i] + " Es el maximo!");
        } else if (num[i] == minimo){
          System.out.println("El valor " + (i+1) + " introducido, con el numero " + num[i] + " Es el minimo!");
        } else {
          System.out.println("El valor " + (i+1) + " introducido, es el numero " + num[i]);
           }

      }




  }
}
