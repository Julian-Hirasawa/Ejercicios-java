import java.util.Scanner;
public class Ejercicio6 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] num = new int[15];

    for (int i = 0; i< num.length; i++){
      System.out.println("Introduce un numero por pantalla: ");
      num[i] = Integer.parseInt(s.nextLine());
     
    }
    int final1 = num[14];

    for ( int i = 14; i > 0;i--){

        num[i] = num[i-1];
    }
    num[0] = final1;
    for(int x = 0; x< num.length;x++){
      System.out.println("La posicion " + (x+1) + " tiene el numero: " + num[x]);
    }




  }
}
