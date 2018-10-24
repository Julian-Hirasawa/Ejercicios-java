public class Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("Te voy a mostar una carta de la baraja francesa al azar.");
    
    String cartaPalo = "";
    String cartaNumero = "";
    
    int palos = 0;
    int numero = 0;
    
    palos = (int)(Math.random()*4)+1;
    
    switch (palos) {
      case 1:
      cartaPalo = "Picas";
      break;
      case 2:
      cartaPalo = "corazones";
      break;
      case 3:
      cartaPalo = "Diamantes";
      break;
      case 4:
      cartaPalo = "Treboles";
      break;
      }
      
      numero = (int)(Math.random()*13) + 1;
      
      switch (numero) {
        case 1:
        cartaNumero = "A";
        break;
        case 11:
        cartaNumero = "J";
        break;
        case 12:
        cartaNumero = "Q";
        break;
        case 13:
        cartaNumero = "K";
        break;
        default:
        cartaNumero = String.valueOf(numero);
               
      }
      
    System.out.print("La carta aleatoria es " + cartaNumero  + " de " + cartaPalo + ".");
  }
}
    
