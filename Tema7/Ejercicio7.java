import java.util.Scanner;
public class Ejercicio7 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Voy a generar 100 numeros aleatorios en una lista de 20, cuando llegue el momento, te pedire que de esa lista dos numeros los intercambies.");

    int[] num = new int[20];
    int inicial1 = 0;
    int final1 = 0;
    int aux = 0;
    for ( int x = 0; x < num.length; x++){
      num[x] = (int)(Math.random()*100);
      System.out.println("Pos." + (x+1) + ": "+ num[x]);
    }
    System.out.println("Introduce el valor inicial(Entre 1 y 20) a cambiar por el segundo valor: ");
    inicial1 = (Integer.parseInt(s.nextLine()) - 1);
    System.out.println("Introduce el valor iniciall a cambiar por el segundo valor: ");
    final1 = (Integer.parseInt(s.nextLine()) - 1 );

    aux = num[inicial1];

    num[inicial1] = num[final1];

    num[final1] = aux;

    System.out.println("LA lista con los numeros cambiados quedaria tal que: ");
    for (int i = 0; i < num.length;i++){
      System.out.println("Pos. " + (i+1) + ": " + num[i]);
    }





  }
}
