public class Ejercicio21 {
  public static void main(String[] args) {
    
    int numero = 0;
    int numerosIntroducidos = 0;
    int resto = 0;
    int impar = 0;
    int media = 0;
    int numAnterior = 0;
    int mediaTotal = 0;
    System.out.println("Intoduce un numeros y te dire cuantos has metido,  la media de los impares y el mayor de los pares para parar pon un numero negativo");
    while ( numero >=0 ) {
        System.out.print("Introduce un numero:" );
        numero = Integer.parseInt(System.console().readLine());
        
        if ( numero >=0) {
            numerosIntroducidos++;
            
            resto = numero%2;
            if (resto != 0){
              impar += numero;
              media++;
            } 
            if ( (resto == 0) && (numero > numAnterior) ){
            numAnterior = numero;
            
            }
            
    }
  }
  mediaTotal = ( impar / media );
  System.out.println("En total has introducido: " + numerosIntroducidos + " numeros");
  System.out.println("La media de los numeros impares es: " + mediaTotal);
  System.out.println("El numero par mas grande introducido es el: " + numAnterior); 
}
}
