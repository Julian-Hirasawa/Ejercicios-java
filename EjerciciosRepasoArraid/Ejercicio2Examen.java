import java.util.Scanner;
public class Ejercicio2Examen {
  public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   int[] premios = new int[13];
   boolean repetido = false;
   for ( int x = 0; x < premios.length; x++){
     do {
       premios[x] = (int)(Math.random()*100000);
       repetido = false;
       for ( int i = 0; i < x; i++){

         if ( premios[x] == premios[i]){
           repetido = true;
         }
       }
     } while (repetido);
    //  repetido = false;
   }
    for ( int x = 0; x < premios.length; x++){
     System.out.print(premios[x] + " ");
    }
    System.out.println();
    boolean primer = false;
    boolean segundo = false;
    boolean tercer = false;
    boolean pedreas = false;
    boolean reintegros = false;
    boolean salir = false;
    int numero = 0;
    do {
      System.out.println("Introduce el numero a comprobar si esta ganado o no, poi.");
      numero = Integer.parseInt(s.nextLine());
      if (numero == 0) {
        salir = true;
      } else if (numero == premios[0]) {
        primer = true;
        System.out.println("Enhorabuena, has ganado 1000€ mierdosos menos lo que se lleve luego hacienda.");
      } else if (numero == premios[1]) {
        segundo = true;
        System.out.println("Has ganado el segundo premio.");
        System.out.println("Ni mas ni menos(bueno si, con lo que se lleva hacienda) 500jebros");
      } else if ( numero == premios[2]){
        tercer = true;
        System.out.println("250francos para gastarlos en lootbooxes");
      }
      for ( int x = 3; x < 13; x++ ){
        if ( numero == premios[x]){
          pedreas = true;
          System.out.println("Tu numero tiene 10€");
        }
      }
      if ( (( numero % 10 ) == (premios[0] %10))) {
        System.out.println("Has ganados 5€ por coinicidir la ultima cifra con el premio");
      }
      int primeraCifra = numero;
      while ( primeraCifra > 10) {
        primeraCifra = primeraCifra / 10;
      }
      if ( (primeraCifra) ==(premios[0] %10 )){
        System.out.println("HAs ganado 5€ por coincidir la primera cifra con la ultima del premio");
      }



    } while ( !salir );


  }
}
