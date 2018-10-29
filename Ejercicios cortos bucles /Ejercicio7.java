public class Ejercicio7 {
  public static void main(String[] args){
    
   int altura = 0;
   
   System.out.print("Introduce la altura: ");
   altura = Integer.parseInt(System.console().readLine());
   
   int linea = 0;
   int espacios = 0;
   int alturaRestante = 0;
   int numero = 1;
   alturaRestante = altura;
   espacios = altura - 1;
   while ( linea < altura){
     
     for(int x = 0; x < espacios; x++){
      System.out.print(" ");
     }
     espacios--;
     linea++;
   
      for ( int i = 0; i < numero; i++){ 
        System.out.print(alturaRestante);
        
      }
   
      alturaRestante--;
      numero++;
      System.out.println();
    
   }
   
   System.out.println();
   
   int linea2 = 0;
   int espacio2 = 1;
   int numero2 = 1;
   int suma = 0;
  
  
  
   while (linea2 < altura ) {
     
     if (linea2 >= 1){
        for ( int x = 0; x < espacio2; x++){
          System.out.print(" ");
        }
        espacio2++;
      }
     
     for ( int i = 0; i < numero2; i++){
       suma++;
       System.out.print(suma);
       
     }
     suma = 0;
     numero2++;
     System.out.println();
     linea2++;
   }
   
   System.out.println();
   
   int linea3 = 0;
   int comienzo = 0;
   int espacios3 = 1;
   int atras = 1;
   comienzo = altura;
   
   while ( linea3 < altura ) {
     
     
     
     if (linea3 >= 0){
      for (int x = 0; x <= espacios ; x++){
        System.out.print(" ");
      }  
      espacios++;
     }
     
     for ( int z = 0; z < atras; z++){
       System.out.print(comienzo);
       comienzo--;
     }
     atras++;
     comienzo = altura;
     System.out.println();
     
     linea3++;
     
   }
    
  }
}
