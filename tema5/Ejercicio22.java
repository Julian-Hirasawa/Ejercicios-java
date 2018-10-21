public class Ejercicio22 {
  public static void main(String[] args) {
    
    
    System.out.println("Te voy a mostrar por pantalla todos los numeros primos del 2 al 100");
    
    boolean primo = true;
    int numero = 1;
    
    while (numero <=100) {
         
         for (int resto = 2; resto<numero; resto++){
           numero++;
           if ((numero % resto)==0){
             primo = false;
           }
           if (primo){
           System.out.print(primo);
         }
       }
       }
     
     }
   }
