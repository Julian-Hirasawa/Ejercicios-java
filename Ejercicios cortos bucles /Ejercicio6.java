public class Ejercicio6 {
  public static void main(String[] args){
    
   int altura = 0;
   
   System.out.print("Introduce la altura: ");
   altura = Integer.parseInt(System.console().readLine());
   
   int linea = 0;
   int pintada = 1;
   int suma = 2;
   int comienzo = 0;
   while (linea < altura) {
     linea++;
     
       comienzo++;
       System.out.print(comienzo);
       
       if (linea > 1 ){
         
         for ( int x = 0; x < pintada; x++){
           
           System.out.print(suma);
         }
         suma++;
         pintada++;
       }
       
    
     
     
   
    System.out.println();
   } 
   System.out.println();
   int linea2 = 0;
   int pintada2 = 1;
   int resta = 0;
   int resta1 = 0;
   resta = altura;
   resta1 = altura - 1;
    while ( linea2 < altura ){
      
      System.out.print(resta);
      resta--;
      
      if ( linea2 >= 1 ){
        for ( int x = 0; x < pintada2; x++){
          System.out.print(resta1);
        
        }
        resta1--; 
        pintada2++;
      }
      
      linea2++;
      
      System.out.println();
      
     } 
    System.out.println();
    
    int linea3 = 0;
    int cuentaAtras = 1;
    int suma3 = 1;
    
    while (linea3 < altura ){
      
      System.out.print(1);
        
        if (linea3 >= 1){
          for ( int x = 0; x < cuentaAtras; x++){
            suma3++;
            System.out.print(suma3);
            
          }
          suma3 = 1;
          cuentaAtras++;
        }
      
      linea3++;
      System.out.println();
    }
    
  }
}
