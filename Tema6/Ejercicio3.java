public class Ejercicio3 {
  public static void main(String[] args){
    
    String nombreCarta = "";
    String cartaNumero = "";
    
    int nombre = (int)(Math.random()*4)+1;
    
    switch (nombre) {
      case 1:
      nombreCarta = "Oros";
      break;
      case 2:
      nombreCarta = "Copas";
      break;
      case 3:
      nombreCarta = "Bastos";
      break;
      case 4:
      nombreCarta = "Espadas";
      break;
    }
    
    int numero = (int)(Math.random()*10) + 1;
    
    switch (numero){
      case 1:
      cartaNumero = "AS";
      break;
      case 8:
      cartaNumero = "Sota";
      break;
      case 9:
      cartaNumero = "Caballo";
      break;
      case 10:
      cartaNumero = "Rey";
      break;
      default:
      cartaNumero = String.valueOf(numero);
            
    }
    System.out.print("La carta aleatoria es el: " + cartaNumero + " de " + nombreCarta);
    
    
  }
}
      
    
    
