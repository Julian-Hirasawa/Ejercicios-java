public class Ejercicio7 {
  public static void main(String[] args){
    
    int combinacion = 0;
    int intentos = 0;
    
    System.out.println("Bienvenido al pograma de la caja fuerte, recuerda solo tienes 5 intentos!");
    
    while ( ((combinacion != 6969) && (intentos != 5))) {
      System.out.println("Introduce la combinacion de la caja fuerte de 4 cifras");
      combinacion = Integer.parseInt(System.console().readLine());
      intentos++;
      if ((combinacion != 6969) && (intentos<=4)){
        System.out.println("Erronea, vuelve a introducirla");
      }
    }
    if (combinacion == 6969) {
     System.out.print("Has abierto el santo grial"); 
    } else if (intentos == 5) {
      System.out.print("Numero de intentos incorrectos superados, se ha bloqueado la caja fuerte");
      
    }
  }
}
