public class Ejercicio3 {
  public static void main(String[] args){
    
    System.out.print("Introduce un numero del 1 al 7 y de dire el dia 7 de la semana: ");
    String dia = System.console().readLine();
    int diaNumero = Integer.parseInt( dia );
    
    String diaNombre = "";
    switch (diaNumero) {
      case 1:
      diaNombre = "Lunes";
      break;
      case 2:
      diaNombre = "Martes";
      break;
      case 3:
      diaNombre = "Miercoles";
      break;
      case 4:
      diaNombre = "Jueves";
      break;
      case 5:
      diaNombre = "Viernes";
      break;
      case 6:
      diaNombre = "Sabado";
      break;
      case 7:
      diaNombre = "Domingo";
      break;
      default:
      System.out.print("Has introducido un numero incorrecto");
      break;
    }
    System.out.print("El dia numero " + dia + " corresponde al " + diaNombre);
  }
}
      
