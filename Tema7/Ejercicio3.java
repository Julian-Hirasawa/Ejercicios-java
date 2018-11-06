import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args){
Scanner s = new Scanner(System.in);
    int[] num = new int[10];

    for(int i = 0; i<10;i++){
      System.out.print("Introduce 10 numeros. (Num Restantes)" + (num.length - i) + ": ");
      num[i] = Integer.parseInt(s.next());
    }
    System.out.println("Ahora te los voy a mostrar en orden inverso");
    for(int x = 9 ; x >= 0 ;x-- ){
      System.out.print(num[x]);
      if (x >= 1){
        System.out.print(", ");
      }

    }


  }
}
