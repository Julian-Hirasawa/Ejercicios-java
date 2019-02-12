import java.util.ArrayList;

public class Ejercicio2 {
  public static void main(String[] args){
    ArrayList<Integer> aleatorio = new ArrayList<Integer>();
    int tamaño = (int)(Math.random()*11 + 10);
    System.out.println(tamaño);
    for ( int x = 0; x < tamaño; x++){
      aleatorio.add((int)(Math.random()*101));
    }
    System.out.println(aleatorio);
    int suma = 0;
    for (Integer a: aleatorio
         ) {
      suma += a;
    }
    System.out.println("La suma total es de " + suma);
    int media = 0;
    media = suma / aleatorio.size();
    System.out.println("La media es de " + media);
    int maximo = 0;
    int minimo = 100;
    for (Integer a: aleatorio
         ) {
      if (a > maximo) {
        maximo = a;
      }
      if (a < minimo) {
        minimo = a;
      }
    }
    System.out.println("El minimo es: " + minimo + " y el maximo es " + maximo );
  }
}
