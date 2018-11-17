/*
Vamos a crear un busca minas rustico, en el cual tendremos un tablero de 5x5, con 6 minas aleatorias que se pondran en el tablero, 7 intentos restantes y si hay una mina cerca te lo avisara-
*/
import java.lang.management.MemoryType;
import java.util.Scanner;
public class EjercicioB7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] tabla = new String[5][5];
    String[][] tablaVacia = new String[5][5]; // para mostrar donde el usuario a marcado
    int[] mina = new int[7];
    int campoMina = 0;
    int premio = 0;
    boolean minaPremio = false;

    System.out.println("\033[35mBienvenido al BuscaMinas 4.0 next generation.\u001B[0m");
    System.out.println("Tienes 7 intentos para acertar el premio, si caes en una mina pierdes obviamente, si hay una mina en las columnas colidnates a la que has elegido te avisare.");
    // mostramos la tabla vacia e iniciamos la tabla y tablavacia en blanco
    System.out.println("        1       2       3       4       5");
      for (int x = 0; x < 5; x++) {
        System.out.print((x+1)+ "   ");
        for (int i = 0; i < 5; i++) {
          tabla[x][i] = "";
          tablaVacia[x][i] = "";
          System.out.print("|   " + tabla[x][i] + "   |");
          if (i == 4) {
            System.out.println();
          }
        }

    }

    // aqui generamos las posiciones de las minas para luego colocarlas en la tabla
    for (int x = 0; x < mina.length; x++) {
      mina[x] = (int) (Math.random() * 20);

    }
    // generamos el premio y aseguramos que no topa coincida con ninguna mina
    do {
      minaPremio = false;
      premio = (int) (Math.random() * 20);
        for (int x = 0; x < mina.length;x++){
      if (mina[x] == premio){
        minaPremio = true;
      }
    }
    } while(minaPremio == true);


    // aqui metemos en la tabla las minas y el premio segun lo generado anteriormente.
    for (int x = 0; x < 5; x++) {
      for (int i = 0; i < 5; i++) {

        tabla[x][i] = " ";
        for (int j = 0; j < mina.length; j++) {
          if (campoMina == mina[j]) {
            tabla[x][i] = "x";
          }
          if (campoMina == premio) {
            tabla[x][i] = "69";
          }

        }
        campoMina++;

      }
    }

    int intentos = 7;
    int col = 0;
    int fila = 0;
    boolean minaCerca = false;
    boolean acierto = false;
    boolean mina1 = false;

    while ((intentos >= 1) && (acierto == false) && (mina1 == false)) {
      System.out.println("Te quedan " + intentos + " intentos restantes.");
      System.out.println("Introduce la fila: ");
      fila = Integer.parseInt(s.nextLine());
      System.out.println("Introduce la columna: ");
      col = Integer.parseInt(s.nextLine());
      fila = fila - 1;
      col = col - 1;
      if (tabla[col][fila].equals("x")) {
        System.out.println("Lo siento has faileado, has caido en una mina wey");
        mina1 = true;

      }
      if (tabla[col][fila].equals(" ")) {
        tablaVacia[col][fila] = "N";
        tabla[col][fila] = "N";
        System.out.println("Hueco en blanco");
        // Aqui comprobamos si en las casillas del alrededor hay una mina o no. Si la hay se pone mina cerca en true. Se podria añadir a los 3 ultimos if que si minacerca es true no lo compruebe directamente.
        if ( (fila < 4) ){
          if ( (tabla[col][fila+1].equals("x")) ){
          minaCerca = true;
          }
        }
        if (fila > 0){
          if ( tabla[col][fila-1].equals("x")){
            minaCerca = true;
          }
        }
        if ( col > 0 ){
          if ( tabla[col-1][fila].equals("x")){
            minaCerca = true;
          }
        }
        if (col < 4){
          if (tabla[col+1][fila].equals("x")){
            minaCerca = true;
          }
        }
        if (minaCerca){
          System.out.println("\033[31mCuidado wey hay una mina cerca \u001B[0m");
        }
        System.out.println("        1       2       3       4       5");
        for (int x = 0; x < 5; x++) {
          System.out.print((x+1)+ "   ");
          for (int i = 0; i < 5; i++) {

            System.out.print("|   " + tablaVacia[x][i] + "   |");
            if (i == 4) {
              System.out.println();
            }
          }
        }
      }
      if (tabla[col][fila].equals("69")) {
        System.out.println("\033[35mHas hacertado!!!!!!!!!!!!\u001B[0m");
        acierto = true;

      }
      if ( (acierto) || (mina1) ){

        System.out.println("        1       2       3         4        5");
        for (int x = 0; x < 5; x++) {
          System.out.print((x+1)+ "   ");
          for (int i = 0; i < 5; i++) {

            System.out.print("|   " + tabla[x][i] + "   |");
            if (i == 4) {
              System.out.println();
            }
          }
        }
      }

        intentos--;


    }
  }
}
