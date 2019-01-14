import java.util.Scanner;
public class Ejer1ExamFunciones {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String palabras[] = {"JULIO","BORRACHO","ANTONIO","XIAOMO","YONI","EOL","ALFALFA","PEPE","CHERRY","POLED"};
    char palabraelegida[];
    palabraelegida = palabraelegida(palabras);

    mostarPalabra(palabraelegida);
    System.out.println();
   // longitudPalabra(palabraelegida);
   char[] palabrablanco =  palabraEnBlanco(longitudPalabra(palabraelegida));
    mostarPalabra(palabrablanco);
    char palabra = ' ';
    boolean acertado = false;
    int intentos = 5;
    do {
      System.out.println("Introduce una letra:");
      palabra = s.next().toUpperCase().charAt(0);

      destapaLetra(palabraelegida, palabrablanco, palabra);
      mostarPalabra(palabrablanco);
      acertado = palabraDescubierta(palabrablanco);
      intentos--;
      System.out.println("Te quedan " + intentos + " intentos");
    } while( (!acertado) && ( intentos > 0));


  }


  public static char[] palabraelegida (String[] palabras){
    int elegida = (int)(Math.random()*palabras.length);
    char[] palabraelegida = new char[palabras[elegida].length()];
    for (int x = 0; x < palabras[elegida].length(); x++){
      palabraelegida[x] = palabras[elegida].charAt(x);
    }
    return  palabraelegida;
  }
    public static void mostarPalabra (char[] palabra){
    for (int x = 0; x < palabra.length; x++){
      System.out.print(palabra[x] + " ");


    }
    return;
  }
  public static int longitudPalabra (char[] palabraelegida){
   int longitud = palabraelegida.length;
   return longitud;
  }
  public static char[] palabraEnBlanco (int logitud){
    char[] palabraOculta = new char[logitud];
    for (int x = 0; x < logitud; x++){
      palabraOculta[x] = '_';
    }
    return palabraOculta;
  }
  public static boolean palabraDescubierta (char[] palabrasOcultas){
    boolean acertado = true;
    for ( int x = 0; x < palabrasOcultas.length; x++){
      if ( palabrasOcultas[x] == '_'){
        acertado = false;
      } else if ((!acertado) && (x == (palabrasOcultas.length -1 ))){
        acertado = true;
      }
    }
    return acertado;
  } public static char[] destapaLetra (char[] palabraElegida, char[] palabraOculta, char palabraIntroducida) {
    boolean acierto = false;
    for ( int x = 0; x < palabraElegida.length; x++){
      if ( palabraIntroducida == palabraElegida[x] ){
        palabraOculta[x] = palabraElegida[x];
        acierto = true;
      } else if (!acierto){
       acierto = false;
      }
    }
    if ( !acierto) {
      System.out.println("La letra no estaba");
    } else {
      System.out.println("La Letra introducida estaba");
    }
    return palabraOculta;
  }
}
