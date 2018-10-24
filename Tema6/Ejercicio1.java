public class Ejercicio1 {
  public static void main(String[] args){
    
    System.out.println("Voy a mostrar por pantalla la tirada de tres dados y la sima de las tres tiradas");
    
    int tirada = 0;
    int numero = 0;
    int numeroSuma = 0;
    

    for ( int x = 1; x <= 3 ; x++){
    tirada = (int)(Math.random()*6)+1;
    numeroSuma += tirada;
    System.out.println("En la tirada Nº "+ x + " es de " + tirada); 
    
    }
    System.out.print("La suma total de las tres tiradas es de: " + numeroSuma);
  }
}
