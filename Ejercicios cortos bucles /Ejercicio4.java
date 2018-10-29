public class Ejercicio4 {
  public static void main(String[] args){
    
    int numeroAlto = 0;
    int numeroBajo = 0;
    int salto = 0;
    
    System.out.print("Introduzca el numero mas alto: ");
    numeroAlto = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el numero mas bajo: ");
    numeroBajo = Integer.parseInt(System.console().readLine());
    System.out.print("introduce el salto: ");
    salto = Integer.parseInt(System.console().readLine());
    
    System.out.print(numeroAlto + "-");
    
    while ( (numeroAlto > numeroBajo) && ( ((numeroAlto - numeroBajo) >= salto)) ) {
      numeroAlto -= salto;
      System.out.print(numeroAlto);
      
      if (numeroAlto >= numeroBajo && ( ((numeroAlto - numeroBajo) >= salto)) ){
        System.out.print("-");
      }
      
    }
  }
}

