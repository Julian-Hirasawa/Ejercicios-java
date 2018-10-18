public class Ejercicio12 {
  public static void main(String[] args){
    
    int n = 0;
    int nActual = 1;
    int nAnterior = 0;
    int nProximo = 0;
    int i = 2;
    
    System.out.println("vamos a mostar n numeros de la serie de Finonacci hasta donde tu quieras");
    System.out.print("Introduce los numeros a mostrar: ");
    n = Integer.parseInt(System.console().readLine());
    
    switch (n) {
      case 1:
      System.out.print("0");
      break;
      case 2:
      System.out.print("0 1");
      break;
      default:
      System.out.print("0 1");
    }
    if ( n > 2 ){
    for ( ; i<n ; i++){
    nProximo = nActual + nAnterior;
    System.out.print(" "+ nProximo + " ");
    nAnterior = nActual;
    nActual = nProximo;
    
    }
  }
  }
}
    
    
