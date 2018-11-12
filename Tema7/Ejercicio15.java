import java.util.Scanner;
public class Ejercicio15 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int mesas[] = new int[10];
    int personas = 0;
    boolean sentado = false;
    int hueco = 0;
    boolean sitio = true;
    for( int x = 0; x < mesas.length; x++){
      mesas[x] = (int)(Math.random()*5);
      System.out.print("Nº: " + (x+1) + "-");
      System.out.print(mesas[x]+ " ");
    }
    System.out.println();
    while ( ( personas != -1) && (sitio == true) ){
    System.out.println("Introduzca las personas que sois:(-1 para salir del programa) ");
    personas = Integer.parseInt(s.nextLine());
    if (personas == -1){
      System.out.println("Finalizado");
    } else if (personas > 4 ){
      System.out.println("No admitimos grupos mayores de 4, so sorry");
    } else {


        for (int x = 0; x < mesas.length; x++){
          if (sentado == false){
            hueco = mesas[x] + personas;

            for ( int z = 0; z < mesas.length; z++){
              if ( mesas[z] == 0){
                System.out.println("Sientate en la mesa " + (z+1));
                sentado = true;
                mesas[z] = mesas[z] + personas;
                z = mesas.length;
              }
            }
           if ( (hueco <= 4) && ( sentado == false) ){

                if ( mesas[x] == 0){
                  System.out.println("Sientate en la mesa " + (x+1));
                } else {
                  System.out.println("Tendas que sentarte con otros en la mesa Nº: " + (x+1));
                }
                sentado = true;
                mesas[x] = mesas[x] + personas;

                for (int i = 0; i < mesas.length; i++){
                  System.out.print("Nº: " + (i+1) + "-" + mesas[i]);
                }
              } else if (  x == 9 ) {
                System.out.print("No hay sitio pa ustedes");
                sitio = false;
              }
          }
        }
        sentado = false;

      for (int i = 0; i < mesas.length; i++){
        System.out.print("Nº: " + (i+1) + "-" + mesas[i]);

      }System.out.println();

    }
    }
    }
}
