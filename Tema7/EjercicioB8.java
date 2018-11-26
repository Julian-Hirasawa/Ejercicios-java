import java.util.Scanner;
public class EjercicioB8 {
  public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    String tablero[][] = new String[8][8];
    String posicion = "";
    String letra = "";
    int columna = 0;
    int fila = 0;
    for (int x = 0; x < 8; x++) {
      for(int i = 0; i < 8; i++){
        tablero[x][i] = " ";
      }
    }

    System.out.println("        a        b        c        d        e        f        g        h  ");
    for (int x = 0; x < 8; x++) {
      System.out.print(   (x+1) + "   ");
      for (int i = 0; i < 8; i++) {

        System.out.print("|   " + tablero[x][i] + "   |");
        if (i == 7 ) {
          System.out.println();
        }
      }
    }

    System.out.println("Introduce en que lugar quieres poner el alfiler(A1): ");
    posicion = s.nextLine();
    letra = posicion.charAt(0) + "";
    fila = Integer.parseInt(posicion.charAt(1)+ "");
    fila = fila-1;
    switch (letra){
      case "a":
        columna = 0;
        break;
      case "b":
        columna = 1;
        break;
      case "c":
        columna = 2;
        break;
      case "d":
        columna = 3;
        break;
      case "e":
        columna = 4;
        break;
      case "f":
        columna = 5;
        break;
      case "g":
        columna = 6;
        break;
      case "h":
        columna = 7;
        break;
    }
    tablero[fila][columna] = "X";


    System.out.println("        a        b        c        d        e        f        g        h  ");
    for (int x = 0; x < 8; x++) {
      System.out.print(   (x+1) + "   ");
       for (int i = 0; i < 8; i++) {

        System.out.print("|   " + tablero[x][i] + "   |");
        if (i == 7 ) {
          System.out.println();
        }
      }
    }


    // creamos un arrayd para luego asignar la columna a la letra
    String posicionCol[] = new String[8];
    int posicionFila = 0;

    posicionCol[0] = "a";
    posicionCol[1] = "b";
    posicionCol[2] = "c";
    posicionCol[3] = "d";
    posicionCol[4] = "e";
    posicionCol[5] = "f";
    posicionCol[6] = "g";
    posicionCol[7] = "h";

    // primero hacemos un while para que calcule las posiciones que puede hacer hacia izquierda izq
    System.out.print("Los movimientos que puede realizar son: ");
    int contadorizq = columna;
    int contadorizq1 = fila;
    while ( (contadorizq > 0) && (contadorizq1 > 0)) {
      contadorizq--;
      contadorizq1--;
      tablero[contadorizq1][contadorizq] = "Z";
      System.out.print(posicionCol[contadorizq] + contadorizq1+",");
      }

      // While que calcula donde se puede mover en la derecha hacia arriba
    int contadorder = columna;
    int contadorder1 = fila;

     while ( (contadorder < 7) && (contadorder1 > 0)) {
      contadorder++;
      contadorder1--;
      tablero[contadorder1][contadorder] = "Z";
       System.out.print(posicionCol[contadorder] + contadorder1+ ",");
    }
    // while que calcula que posiciones se puede mover en izq hacia abajo
    contadorder = columna;
    contadorder1 = fila;
    while ( (contadorder > 0) && (contadorder1 < 7)) {
      contadorder--;
      contadorder1++;
      tablero[contadorder1][contadorder] = "Z";
      System.out.print(posicionCol[contadorder] + contadorder1+",");

    }
    // while que calcula donde se puede mover desde la derecha hacia abaho
    contadorder = columna;
    contadorder1 = fila;
    while ( (contadorder < 7) && (contadorder1 < 7)) {
      contadorder++;
      contadorder1++;
      tablero[contadorder1][contadorder] = "Z";
      if ((contadorder == 7) || (contadorder1==7)){
        System.out.print(posicionCol[contadorder] + contadorder1+".");
      } else {
        System.out.print(posicionCol[contadorder] + contadorder1 + ",");
      }
    }
    System.out.println();

    // dibuja el tablero con los movimiento que puede hacer
    System.out.println("        a        b        c        d        e        f        g        h  ");
    for (int x = 0; x < 8; x++) {
      System.out.print(   (x+1) + "   ");
      for (int i = 0; i < 8; i++) {

        System.out.print("|   " + tablero[x][i] + "   |");
        if (i == 7 ) {
          System.out.println();
        }
      }
    }

  }
}
