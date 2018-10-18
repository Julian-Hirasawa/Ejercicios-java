public class Ejercicio11 {
  public static void main(String[] args){
    
    int i = 0;
    int maxI = 0;
    int cubo = 0;
    int cuadrado = 0;
    System.out.println("Introduce un numero y te dire los 5 siguientes numeros al introducido \n su cuadrado y su cubo");
    System.out.print("Introduce un numero: ");
    i = Integer.parseInt(System.console().readLine());
    
    maxI = i+4;
    
    for ( ; i<=maxI; i++) {
    cuadrado = i*i;
    cubo = i*i*i;
    System.out.printf("%1d --> %3d %5d\n",i, cuadrado, cubo);
    
    
    }
  }
}
