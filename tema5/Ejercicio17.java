public class Ejercicio17 {
  public static void main(String[] args){
    
    int numeroIntroducido = 0;
    int siguientesMax = 0;
    int totalSuma = 0;
    int total = 0;
    System.out.print("Introduce un numero entero positivo y te sumare los 100 siguientes numeros a este: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    int numeroOriginal = numeroIntroducido;
    siguientesMax = numeroIntroducido + 100;
    
    do {
      numeroIntroducido++;
      totalSuma +=numeroIntroducido;
    } while ( numeroIntroducido <= siguientesMax);
     
    
    System.out.print("El numero " + numeroOriginal + " mas la suma de los 100 siguientes es de: " + totalSuma);
  }
}
    
    
