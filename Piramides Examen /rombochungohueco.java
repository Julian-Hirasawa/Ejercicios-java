public class rombochungohueco{
  public static void main(String[] args){
    
   int altura = 0;
   System.out.print("Introduce la altura del rombo: ");
   altura = Integer.parseInt(System.console().readLine());
   
   int pintada = 0;
   int espacios = altura -1;
   int hueco = 1;
   
   while (pintada < altura){
     
     for ( int x = 0; x < espacios; x++){
       System.out.print(" ");
       
     }
     espacios--;
     
     System.out.print("*");
     
     if ( pintada > 0 ){
       for (int i = 0; i < hueco; i++){
         System.out.print(" ");
       }
       System.out.print("*");
       hueco += 2;
     }
          
     pintada++;
     System.out.println();
          
   }
   
   pintada = 0;
   espacios = 1;
   hueco = altura;
   while (pintada < altura - 1 ){
     
     for ( int x = 0; x < espacios; x++){
       System.out.print(" ");
     }
     espacios++;
     System.out.print("*");
    
      if (pintada < altura - 2){
        for (int i = 0; i < hueco ; i++){
          System.out.print(" ");
        }
        hueco -=2;
        System.out.print("*");
      } 
      
     pintada++;
     System.out.println();
     
   }
    
  }
}
