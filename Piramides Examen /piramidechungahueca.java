public class piramidechungahueca {
  public static void main(String[] args){
    
    int altura = 0;
    
   System.out.print("Introduce de cuanto quieres que sea la piramide de alto: ");
   altura = Integer.parseInt(System.console().readLine());
   
   int pintada = 0;
   int espacio = 1;
   while (pintada < altura ){
     
     System.out.print('*');
     
     if (pintada > 1){
        
        for (int x = 0; x < espacio; x++){
          System.out.print(" ");
        }
       espacio++;
      }
     
     if (pintada > 0 ){
       System.out.print("*");
              
     }
     System.out.println();
     pintada++;
   } 
   pintada = 0;
   espacio = altura - 1;
    while (  pintada <= altura ) {
      
      System.out.print("*");
      
      if (pintada < altura -1 ){
        
        for ( int z = 0; z < espacio; z++){
          System.out.print(" ");
                   
        }
        espacio--;
      }
      
      if ( pintada < altura){
        System.out.print("*");
      }
      pintada++;
      System.out.println();
      
    }
    
  }
}
