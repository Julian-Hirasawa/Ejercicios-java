import java.util.Scanner;
public class Ejer1Exam {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String[] palabras = {"ILLYASVIELS","HOROSHO","MAX","ZEROTWO","HONOKA","VEGETTA","JULIO","SHIROU","LISA","MONIKA"};
  //   char palabraelegida[];
    int elegida = 0;
    elegida = (int)(Math.random()*palabras.length);
    // System.out.println(elegida);
    char[] palabraelegida = new char[palabras[elegida].length()];

    for (int x = 0; x < palabras[elegida].length(); x++){
      palabraelegida[x] = palabras[elegida].charAt(x);
    }
    /*
    for ( int x = 0; x < palabras[elegida].length(); x++){
      System.out.print(palabraelegida[x] + " ");
    } */
    char[] palabraoculta = new char[palabras[elegida].length()];
    for ( int x = 0; x < palabraoculta.length; x++){
      palabraoculta[x] = '_';
    }
  /*  System.out.println();
    for ( int x = 0; x < palabras[elegida].length(); x++){
      System.out.print(palabraoculta[x] + " ");
    } */
    char letraintroducida = ' ';
    int intentos = 5;
    boolean completado = true;
    boolean acierto = false;
    boolean salir = false;
    do {
      System.out.println("Introduce una letra a adivinar");
      letraintroducida = s.next().toUpperCase().charAt(0);
      if (letraintroducida != '0') {
          for (int x = 0; x < palabras[elegida].length(); x++) {
          if (letraintroducida == palabraelegida[x]) {
            palabraoculta[x] = letraintroducida;
            acierto = true;
            System.out.println("La letra introducida esta en la palabra.");

          } else if ((!acierto) && (x == (palabras[elegida].length() - 1))) {
            System.out.println("La introducina no se encuentra en la palabra");
            intentos--;
            acierto = false;
          }
          completado = true;
          for (int i = 0; i < palabras[elegida].length(); i++) {
            if (palabraoculta[i] == '_') {
              completado = false;
            } else if ((palabraoculta[i] == palabraelegida[i]) && (completado)) {
              completado = true;
            }
          }


        }

        for (int x = 0; x < palabras[elegida].length(); x++) {
          System.out.print(palabraoculta[x] + " ");
        }
        System.out.println();
        acierto = false;

        System.out.println("Te quedan " + intentos + " intentos restantes weye.");
      } else {
        completado = false;
        salir = true;
      }
    } while ( ( intentos > 0) && (!completado) && (!salir)  );

    if ( completado){
      System.out.println("Enhorabuena has ganado 5 Iphones X");
    } else if (salir) {
      System.out.println("Has salido como una gallina");
    }
    else {
      System.out.println("Lo siento has perdido.");
    }


  }
}
