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
   
    
  }
}
