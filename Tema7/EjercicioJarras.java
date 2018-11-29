import java.util.Scanner;
public class EjercicioJarras {

  public static void main(String[] args){

    Scanner s = new Scanner(System.in);

    System.out.println("Vamoh a hacer cosas nasis con unas jarras de agua, en la cual, tendras que dejar una jarra con un(1) solo Litro en una para acabar este pogama infernal");

    int jarra1[] = new int[2];
    int jarra2[] = new int[2];
    int operacion = 0;
    String jarra = "";
    boolean salir = false;
    boolean lleno = false;

    jarra1[0] = 5; // capacidad total
    jarra1[1] = 0; // cantidad
    jarra2[0] = 7;
    jarra2[1] = 0;

    System.out.println("La capacidad de la jarra 1 es de " + jarra1[1] + " litros. Con una capacidad maxima de " + jarra1[0]);
    System.out.println("La capacidad de la jarra 2 es de " + jarra2[1] + " litros. Con una capacidad maxima de " + jarra2[0]);


    do {
      System.out.println("Elige una de las tres opciones a realizar sobre las jarras:");
      System.out.println("(1) -Llenar una jarra completamente.");
      System.out.println("(2) -Vaciar una jarra.");
      System.out.println("(3) -Llenarla con el agua de la otra jarra.");
      System.out.println("(0) -Salir");
      operacion = Integer.parseInt(s.nextLine());

      if ( operacion == 0){
        salir = true;
      }

      if (operacion == 1) {
        System.out.println("Introduce la jarra a llenar:(min 1/2) ");
        jarra = s.nextLine();

        if (jarra.equals("1")) {
          jarra1[1] = 5;

        } else {
          jarra2[1] = 7;
        }

      } else if (operacion == 2) {
        System.out.println("Introduce la jarra a vaciar:(min 1/2) ");
        jarra = s.nextLine();

        if (jarra.equals("1")) {

          jarra1[1] = 0;

        } else {
          jarra2[1] = 0;
        }

      } else if (operacion == 3) {
        System.out.println("Introduce la jarra a rellenar:(min 1/2) ");
        jarra = s.nextLine();
        if ( jarra.equals("1")){
          int cantidad = 0;
          cantidad = jarra1[0] - jarra1[1];
          while ( (cantidad != 0) && (jarra2[1]!=0)){
            jarra2[1]--;
            jarra1[1]++;
            cantidad--;
          }
        } else {
          int cantidad = 0;
          cantidad = jarra2[0] - jarra2[1];
          while ( (cantidad != 0) && (jarra1[1]!=0)){
            jarra1[1]--;
            jarra2[1]++;
            cantidad--;
          }
        }
      }

      if ( (jarra1[1]==1 ) || (jarra2[1]==1) ){
        lleno = true;

      }
      System.out.println("La cantidad de la jarra 1 es de " + jarra1[1] + " litros. Con una capacidad maxima de " + jarra1[0]);
      System.out.println("La cantidad de la jarra 2 es de " + jarra2[1] + " litros. Con una capacidad maxima de " + jarra2[0]);

    } while ( (!salir) && (!lleno) );



  }
}
