public class rombochungo {
  public static void main(String[] args){
    
   int altura = 0;
   
   System.out.print("Introduce la altura del rombo: ");
   altura = Integer.parseInt(System.console().readLine());
   
   int pintada = 0;
   int espacios = altura - 1;
   int relleno = 1;
    while (pintada < altura ){
      
      if ( pintada < altura -1) {
        for (int x = 0; x < espacios; x++){
          System.out.print(" ");
        }
        espacios--;
      }
      
      for ( int i= 0; i < relleno; i++){
        System.out.print("*");
      } 
      relleno += 2;
      
      pintada++;
      System.out.println();
    }
    
    pintada = 0;
    espacios = 1;
    relleno = (altura*2) - 3;
    while ( pintada < altura ){
      
      if ( pintada < altura - 1 ){
        for ( int x = 0; x < espacios; x++){
          System.out.print(" ");
        }
        espacios++;
      }
      for ( int i = 0; i < relleno; i++){
        System.out.print("*");
      }
      relleno = relleno - 2;
      pintada++;
      System.out.println();
      
      
      
    }
  }
}
