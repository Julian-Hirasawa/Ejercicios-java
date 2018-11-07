import java.util.Scanner;
public class Ejerecicio13 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int[] num = new int[100];
    int valor = 0;
    int minimo = 501;
    int maximo = 0;
    for (int x = 0; x<num.length;x++){
      num[x] = (int)(Math.random()*500+1);
      System.out.printf(num[x] + " ");
      if ( (x == 20) || (x==40) || (x==60) || (x==80) ){
        System.out.println();
      }
    }
    System.out.println();
    System.out.println("Introduce si quieres el minimo(1) o el maximo resaltado(2)");
    valor = Integer.parseInt(s.nextLine());


      for (int x = 0; x < num.length; x++){
        if (num[x] < minimo ){
          minimo = num[x];
        }
        if (num[x] > maximo ){
          maximo = num[x];
        }

      }
      for (int i = 0; i<num.length;i++){
     if (valor  == 1 ) {
       if (num[i] == minimo){
         System.out.print("**" + num[i] + "**");
       } else {
         System.out.print(num[i]+ " ");
       }
       if ( (i == 20) || (i==40) || (i==60) || (i==80) ){
         System.out.println();
       }
     }
     if (valor == 2){
          if (num[i] == maximo){
          System.out.print(" **" + num[i] + "** ");
        } else {
            System.out.print(num[i]+ " ");
          }
       if ( (i == 20) || (i==40) || (i==60) || (i==80) ){
         System.out.println();
       }

      }

    }


  }
}
