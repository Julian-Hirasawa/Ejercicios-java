public class Ejercicio6 {
  public static void main(String[] args) {
    
    System.out.println("Tienes que adivinar el numero que he pensado entre 0 y 100 en menos de 5 intentos");
    
    int adivinar = (int)(Math.random()*100)+10;
    int numero = 0;
    int intentos = 5;
    
    System.out.println(adivinar);
    
    while ( (intentos > 0) && ( numero != adivinar) ){
    System.out.print("Introduce un numero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero == adivinar) {
      System.out.println("Enhorabuena has adivinado el numero!!!, ahora enviamos el iphone x");
    } else {
      intentos--;
       if ( intentos > 0 ) {
      System.out.println("Numero incorrecto vuelte a intentarlo");
      System.out.println("Te quedan " + intentos + " Intentos");
      
      if (numero < adivinar) {
        System.out.println("El numero a adivinar es mayor que " + numero);
          } else {
                System.out.println("El numero a adivinar es menor que " + numero);
                    }
          } else {
          System.out.print("Lo siento, has agotado los intentos");
          }
        } 
      
    
  }
}
}

