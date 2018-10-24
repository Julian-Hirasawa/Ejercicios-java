public class Ejercicio4 {
  public static void main(String[] args) {
   
   System.out.println("Voy a mostrar numeros aleatorios entre 0 y 10: ");
   
   for ( int x = 0; x <20; x++){
     int aleatorio = (int)(Math.random()*11);
     System.out.print(aleatorio + " ");
   } 
    
  }
}
