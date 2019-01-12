import java.util.Scanner;
public class Ejercicio6 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] arraid;
    arraid = CreaYRellena();
    System.out.println();
    invierteVector(arraid);

  }


  public static int[] CreaYRellena (){
    Scanner s = new Scanner(System.in);
    int tamaño = 0;




        System.out.println("Introduce el tamaño del arraid: ");
        tamaño = Integer.parseInt(s.nextLine());
     int[] arraid = new int[tamaño];

     for ( int x = 0; x < tamaño; x++ ){
        System.out.println("Introduce un valor. Pos:" + (x+1));
        arraid[x] = Integer.parseInt(s.nextLine());
      }
      for(int x = 0; x < tamaño; x++) {
        System.out.println(arraid[x] );


    }
    return arraid;
  }
    public static void invierteVector(int[] vector){
    int aux = 1;
    int pos = (vector.length - 1);
    for (int x = 0; x < (vector.length / 2 ); x++){
       aux = vector[x];
      vector[x] = vector[pos];
      vector[pos] = aux;
      pos--;
    }
    for (int x = 0; x < vector.length; x++){
      System.out.print(vector[x] + " ");
    }
  }
}



