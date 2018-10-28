public class Ejercicio13 {
  public static void main(String[] args) {
    
   System.out.println("Voy a tirar dos dados y parare cuando los dos dados tengan el mismo valor");
   
   int dado1 = 0;
   int dado2 = 1;
   int tirada = 0;
   while ( dado1 != dado2) {
     
     dado1 = (int)(Math.random()*6)+1;
     dado2 = (int)(Math.random()*6)+1;
     tirada++;
     System.out.println("Primer dado: " + dado1 + " - Segundo dado: " + dado2);
     
     
   }
   System.out.print("Han sido un total de: " + tirada + " tiradas");
   
   
    
    
  }
}
