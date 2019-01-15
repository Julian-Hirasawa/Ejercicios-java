import misFunciones.*;
import java.util.Scanner;
public class Ejer1paquete {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String palabras[] = {"JULIO","BORRACHO","ANTONIO","XIAOMO","YONI","EOL","ALFALFA","PEPE","CHERRY","POLED"};
    char palabraelegida[];
    palabraelegida = FuncionesEjer1.palabraelegida(palabras);

    FuncionesEjer1.mostarPalabra(palabraelegida);
    System.out.println();
    // longitudPalabra(palabraelegida);
    char[] palabrablanco =  FuncionesEjer1.palabraEnBlanco(FuncionesEjer1.longitudPalabra(palabraelegida));
    FuncionesEjer1.mostarPalabra(palabrablanco);
    char palabra = ' ';
    boolean acertado = false;
    int intentos = 5;
    do {
      System.out.println("Introduce una letra:");
      palabra = s.next().toUpperCase().charAt(0);

     FuncionesEjer1.destapaLetra(palabraelegida, palabrablanco, palabra);
     FuncionesEjer1.mostarPalabra(palabrablanco);
      acertado = FuncionesEjer1.palabraDescubierta(palabrablanco);
      intentos--;
      System.out.println("Te quedan " + intentos + " intentos");
    } while( (!acertado) && ( intentos > 0));
  }
}
