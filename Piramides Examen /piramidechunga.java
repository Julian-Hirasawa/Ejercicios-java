public class piramidechunga {
  public static void main(String[] args){
    
    int altura = 0;
    
      System.out.print("Introduce la altura que va a tener la piramide: ");
      altura = Integer.parseInt(System.console().readLine());
      
      int pintada = 0;
      int ascendente = 1;
      int descendente = 0;
      
      descendente = altura - 1;
      
      while ( pintada < altura ) {
        
        if (pintada < altura ) {
          for ( int s = 0; s < ascendente; s++){
            System.out.print("$");
          }
          ascendente++;
          
        }
         
        System.out.println();
        pintada++;
      }
      pintada = 0;
      while ( pintada < altura - 1){
        
        for (int x = 0; x < descendente; x++){
            System.out.print("$");
          }
          descendente--;
          pintada++;
          System.out.println();
        }
        
      
    
    
  }
}
 
