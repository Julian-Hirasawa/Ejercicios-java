public class Ejercicio9 {
  public static void main(String[] args) {
    
    System.out.println("Voy a generar numeros ramdon pares entre 0 y 100 y parare cuando salga \n un 24 y te dire cuantos se han generado en total");
    
    int aleatorio = 0;
    int par = 0;
    int generados = 0;
    do {
    
       aleatorio = (int)(Math.random()*101);
    
      par = aleatorio % 2;
    
      if (par == 0){
        System.out.print(aleatorio + " ");
        generados++;
      } 
      
    } while ( aleatorio != 24 );
    System.out.println();
    System.out.print("Se han generado " + generados + " numeros aleatorios en total.");
    
    
    
    
    
  }
}
