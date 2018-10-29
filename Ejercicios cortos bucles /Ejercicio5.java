public class Ejercicio5 {
  public static void main(String[] args){
    
    int altura = 0;
    int pintada = 0;
    int espacio = 1;
    System.out.print("Introduzca un numero de que quieres que sea la altura de la piramide");
    altura = Integer.parseInt(System.console().readLine());
    
    
    
    while ( pintada < altura ){
      pintada++;
      
      
      if ( pintada > 1){
        
       for ( int x = 0; x < espacio; x++){  
        System.out.print(" ");
        
      }
      espacio++;
      
      }
      System.out.print(pintada);
      System.out.println();
    }
    System.out.println();
    
     int pintada2 = 0;
     int espacio2 = 1;
     int suma = 2;
     int total = 1;
      while ( pintada2 < altura ){
        pintada2++;
      
          if (pintada2 > 1 ){
            for ( int x = 0; x < espacio2 ; x++){
              System.out.print(" ");
              }   
            espacio2++;
          }
        
        System.out.print(1);
          if (pintada2 > 1){
            for ( int i = 0; i < total ; i++){
            
            System.out.print(suma);
            suma++;
            }
            suma=2;
            total++;
          }
          System.out.println();
      }
      int pintada3 = 0;
      int espacio3 = 1;
      int resta = 1;
      int descendente = 1;
      int alturaRes = altura;
      
      while ( pintada3 <= altura ) {
        
        pintada3++;
        
        if (pintada3 > 1) {
          for ( int x = 0; x < espacio3 ; x++){
            System.out.print(" ");
            
          }
          System.out.print(altura);
          espacio3++;
          
          for ( int i = 1; i < descendente ; i++){
            alturaRes--;
            System.out.print(alturaRes);
            
            
          }
          alturaRes = altura;
          descendente++;
          System.out.println();
        }
        

        
        
      }
  } 
}
