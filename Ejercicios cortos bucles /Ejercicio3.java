public class Ejercicio3 {
  public static void main(String[] args) {
   
   int numeros = 0;
   int primerNumero = 0;
   int salto = 0;
   int pasada = 1;
   System.out.print("Introduce la cantidad de numeros a mostrar: ");
   numeros = Integer.parseInt(System.console().readLine());
   System.out.print("Introduce el primer numero: ");
   primerNumero = Integer.parseInt(System.console().readLine());
   System.out.print("Introduce el salto: ");
   salto = Integer.parseInt(System.console().readLine());
   
   System.out.print(primerNumero + "-");
   while ( pasada < numeros ){
     primerNumero += salto;
     System.out.print(primerNumero);
     pasada++;
     
     if ( pasada < numeros){
       System.out.print("-");
     }
     
   }
    
    
  }
}
