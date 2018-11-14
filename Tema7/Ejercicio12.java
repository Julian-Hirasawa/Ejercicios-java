import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args){

  Scanner s = new Scanner(System.in);
  int num[] = new int[10];
  int inicial = 0;
  int final1 = 0;

  System.out.println("Introduce 10 numeros, luego te pedire un numero inicial y otro final y lo pasare el inicial al final y desplazare estos hacia la derecha");
  for (int x = 0; x < num.length; x++){
    System.out.println("Introduce un numero: ");
    num[x] = Integer.parseInt(s.nextLine());
  }
  System.out.print("Indice:");
  for (int x = 0; x < num.length; x++){
    System.out.printf("%2d" + " |", x+1);
  }
  System.out.println();
  System.out.print("Valor: ");
  for (int x = 0; x < num.length; x++){
    System.out.printf("%2d" + " |", num[x]);
  }
  System.out.println("Introduce un valor entre 0 y 9, y que el inicial sea menor que el final.");
  boolean correctos= true;
  do {
    if ( correctos == false){
      System.out.println("Vuelve a introducir correctamente los numeros, entre 0 y 9 y que el inicia sea menor que el final");
    }
    System.out.println("Introduce el valor inicial: ");
    inicial = Integer.parseInt(s.nextLine());
    System.out.println("Introduce el valor final a cambiar por el inicial");
    final1 = Integer.parseInt(s.nextLine());
    correctos = false;
  } while ( (inicial > final1) || (inicial < 0) || (final1 > 9));
  correctos = true;
    inicial = inicial - 1;
  final1 = final1 - 1;

  int aux = 0;
  aux = num[final1];
  int aux1 = 0;
  aux1 = num[inicial];
  int aux3 = 0;
  aux3 = num[9];
  for ( int x = 9; x > final1; x-- ){
    num[x] = num[x-1];
  }
  num[final1] = aux1;

  for (int x = inicial; x > 0;x--){
    num[x] = num[x-1];
  }
  num[0] = aux3;

    System.out.print("Indice:");
    for (int x = 0; x < num.length; x++){
      System.out.printf("%2d" + " |", x+1);
    }
    System.out.println();
    System.out.print("Valor: ");
    for (int x = 0; x < num.length; x++){
      System.out.printf("%2d" + " |", num[x]);
    }



  }
}
