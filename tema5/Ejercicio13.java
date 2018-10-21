public class Ejercicio13 {
  public static void main(String[] args){
    
    
    int n = 0;
    int positivos = 0;
    int negativos = 0;
    int restantes = 0;
    System.out.println("introduce 10 numeros y te dire cuantos son positivos y cuales negativos");
    
    for ( int x = 1; x<=10; x++){
      restantes = 11 - x;
     System.out.println("Introduce un numero(NunRestantes="+ restantes  +" ): ");
     
     n = Integer.parseInt(System.console().readLine());
     if ( n < 0 ){
       negativos++;
       } else if ( n >= 0) {
         positivos++;
       } 
     }
     System.out.println("El numero de positivos totales es: " + positivos);
     System.out.print("El numero de negativos totales es: " + negativos);
   }
 }
