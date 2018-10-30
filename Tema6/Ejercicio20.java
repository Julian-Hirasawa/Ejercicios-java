public class Ejercicio20{
  public static void main(String[] args){
    
   int capacidad = 0;
   
   System.out.print("Introduce la cantidad de la cuba en litro: ");
   capacidad = Integer.parseInt(System.console().readLine());
   
   int pintada = 0;
   int agua = 0;
   int huecos = 0;
   int anchura = 6;
   agua = (int)(Math.random()*(capacidad)+1);
   
   huecos = capacidad - agua;
   
   while  (pintada <= capacidad )  {
     
     System.out.print("*");
     
     if ( huecos >= 1 ) {
       for (int j = 0; j < (anchura); j++){
         System.out.print(" ");
       }
     }else if( (huecos < 1) && (pintada < (capacidad)) ){
       
       for (int x = 0; x < anchura; x++){
         System.out.print("=");
         
        }
       
      }
     System.out.print("*");
     System.out.println();
     pintada++;
     huecos--;
     
     if ( pintada == (capacidad)){
        for ( int i = 0; i < anchura; i++){
          System.out.print("*");
        }
     }
     
   }
    
    
  }
}
