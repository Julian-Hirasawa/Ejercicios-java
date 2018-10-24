public class Ejercicio5 {
  public static void main(String[] args){
    
  System.out.println("Voy a mostar 50 numeros aleatorios entre 100 y 199, ademas mostrare el num maximo, minimo y la media de todos");
  
  int maximo = 0;
  int minimo = 199;
  int media = 0;
  int mediaTotal = 0;
  
  System.out.print("Los numeros aletarios son: ");
  for ( int x = 0; x < 50; x++){
  int aleatorio = (int)(Math.random()*100) + 100;
  System.out.print( aleatorio + "," );
  media++;
  mediaTotal += aleatorio;
   if ( aleatorio > maximo){
     maximo = aleatorio;
     
   }
   if (aleatorio < minimo){
    minimo = aleatorio; 
   }
  
  }
  mediaTotal = (mediaTotal / media);
  System.out.println("El numero mayor ha sido el: " + maximo);
  System.out.println("El numero menos ha sido el: " + minimo);
  System.out.println("La media de los numeros aleatorios es de: " + mediaTotal);
  

  
}
}
