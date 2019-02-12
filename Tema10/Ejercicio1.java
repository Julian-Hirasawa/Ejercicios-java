import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
  public static void main(String[] args){
    ArrayList<String> nombres = new ArrayList<String>();

    System.out.println("Longitud ararid list " + nombres.size());

    nombres.add("El ruso");
    nombres.add("Illyas viels");
    nombres.add("qwerty");
    nombres.add("nopor");
    nombres.add("Guillifor");
    System.out.println("Longitud ararid list " + nombres.size());

    for ( int x = 0; x < nombres.size(); x++){
      System.out.println("El nombre " + (x+1) + nombres.get(x));
    }
    Collections.sort(nombres);
    for (String yui: nombres) {
      System.out.println(" Los nombres son " + yui);
    }


  }
}
