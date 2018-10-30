public class Ejercicio17 {
  public static void main(String[] args) {
    
   int anchura = 0;
   int altura = 0;
   
   System.out.print("introduce la altura del cuadrado: ");
   altura = Integer.parseInt(System.console().readLine());
   System.out.print("Introduce la anchura del cuadrado: ");
   anchura = Integer.parseInt(System.console().readLine());
   
   int pintada = 0;
   int coordenadaColumna = 0;
   int coordenadaFila = 0;
   
   coordenadaColumna = (int)(Math.random()*(anchura-2))+1;
   coordenadaFila = (int)(Math.random()*(altura-2))+2;
   
   System.out.println();
   
   int espacios = 0;
   int prueba = 0;
   espacios = anchura - 1;
   int resta = 0;
   int resta1 = 0;
   while ( pintada < altura ) {
     
     pintada++;
     
     if ( (pintada == 1) || (pintada == altura) ){
       for ( int x = 0; x < anchura; x++){
         System.out.print("*");
         
       }
       System.out.println();
     }
     
     if ( (pintada > 1) && (pintada < altura) ){
       System.out.print("*");
       
       for ( int i = 1; i < espacios; i++){
         prueba = i;
         
         if ( pintada == coordenadaFila ) {
           if ( i == coordenadaColumna ){
             System.out.print("x");
             
             resta = 1;
            }
            
          } if ( resta != 1 ){
                System.out.print(" ");
                
                
              }
              resta = 0;
        }
        
       System.out.print("*");
       System.out.println();
        
     }
     
     
   }
    
    
  }
}
