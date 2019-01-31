import java.util.Scanner;

public class UsoGato {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

  System.out.println("Introduce cuantos gatos quieres almacenar en la ficha:");
  Gato[] gat = new Gato[Integer.parseInt(s.nextLine())];
 //  Gato[] gat = new Gato[2];
  //  Gat[0]
    for ( int x = 0; x < gat.length; x++){
      gat[x] = new Gato();
    }
    for ( int x = 0; x < gat.length; x++){
      System.out.println("Vamos a rellenar la ficha " + (x+1) + ":");
      System.out.println("Introduce un nombre al grato");
      gat[x].setNombre(s.nextLine());
      System.out.println("Introduce la edad del gato:( -1 si no se sabe cual es)");
      gat[x].setEdad(Integer.parseInt(s.nextLine()));
      System.out.println("Introduce la vida restante del gato:(-1 si no se sabe cuantas tiene)");
      gat[x].setVidas(Integer.parseInt(s.nextLine()));
    }
   // for (int x = 0; x < gat.length; x++){
   //   System.out.println(gat[x]);
   // }
    boolean salir = false;
    int consultar = 0;
    do{
      System.out.println("Introduce una ficha a consultar entre 1  y " + gat.length + " de los gatos que hay metidos. 0 para salir" );
      consultar = Integer.parseInt(s.nextLine());

      if ( consultar != 0){
        consultar -= 1;
        System.out.println(gat[consultar]);
    } else {
        salir = true;
      }

    } while(!salir);


  }
}
