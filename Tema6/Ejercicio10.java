public class Ejercicio10 {
  public static void main(String[] args){
    
    
    System.out.println("Voy a pintar 10 lineas con caracteres aleatorios en cada linea");
    
    int linea = 0;
    int longitud = 0;
    String caracter = "";
    
    while (linea < 10 ) {
      
      int aleatorio = (int)(Math.random()*6);
      
      switch (aleatorio){
        case 0:
          caracter = "*";
          break;
        case 1:
          caracter = "-";
          break;
        case 2:
          caracter = "=";
          break;
        case 3:
          caracter = ".";
          break;
        case 4:
          caracter = "|";
          break;
        case 5:
          caracter = "@";
          break;
      }
      
      longitud = (int)(Math.random()*41);
        for ( int pintada = 0; pintada < longitud; pintada++){
          System.out.print(caracter);
        }
        System.out.println();
        linea++;
      
    }
    
    
  }
}
