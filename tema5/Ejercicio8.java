public class Ejercicio8 {
  public static void main(String[] args){
    
    int numero = 0;
    int multiplicado = 0;
    int total = 0;
    System.out.println("Introduce un numero y te dire su tabla de multiplicar");
    numero = Integer.parseInt(System.console().readLine());
  
     while ( multiplicado<=10) {
       total = numero * multiplicado;
       multiplicado++;
       System.out.print(total + " ");
     }
   }
 }
    
