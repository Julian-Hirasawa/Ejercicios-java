public class Ejercicio15 {
  public static void main(String[] args){
    
    System.out.println("Voy a imprimirte una melodia aleatoria, entre 4  y 28 notas");
    
    int notasTotales = 1;
    int notasPintadas = 0;
    int vertical = 0;
    int multiplo = 1;
    String nota = ""; 
    
   
    while (multiplo != 0) {
      notasTotales = (int)(Math.random()*25)+4;
      multiplo = notasTotales%4;
      
    }
    
    while ( notasPintadas < notasTotales ){
    int numeroNota = (int)(Math.random()*7);
      switch (numeroNota){
        case 0:
          nota = "do";
          break;
        case 1:
          nota = "re";
          break;
        case 2:
          nota = "mi";
          break;
        case 3:
          nota = "fa";
          break;
        case 4:
          nota = "sol";
          break;
        case 5:
          nota = "la";
          break;
        case 6:
          nota = "si";
          break;
      }  
      System.out.print(nota + " ");
      notasPintadas++;
      vertical++;
      if (vertical == 4){
        System.out.print("| ");
        vertical = 0;
      }
      
    }
    
    
    
    
  }
}
