public class Ejercicio2 {
  public static void main(String[] args){
   
   int numero = 0;
   int numeroInicial = 0;
    int numerosTotales = 0;
   System.out.print("Introduzca la cantidad de numeros a imprimir: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el numero inicial ");
    numeroInicial = Integer.parseInt(System.console().readLine());
    
    numerosTotales = numeroInicial + numero;
    
    while (numeroInicial < numerosTotales){
      System.out.print(numeroInicial);
      numeroInicial = numeroInicial + 1;
      
      if ( numeroInicial < numerosTotales){
        System.out.print("-");
      }
      
      
    }
    
  }
}
