public class Ejercicio1 {
  public static void main(String[] args){
    
    
    
    System.out.print("Introduce un dia de la semana y te dire que tienes a primera : ");
    String dia = System.console().readLine();
    dia = dia.toLowerCase();
    
    
    String nombreMes = "";
    
    switch (dia) {
      case "lunes":
      nombreMes = "Sistemas Informaticos";
      System.out.print("El dia " + dia + " hay " + nombreMes); 
      break;
      case "martes":
      nombreMes = "Programacion";
      System.out.print("El dia " + dia + " hay " + nombreMes); 
      break;
      case "miercoles":
      nombreMes = "Entornos de desarrollo";
      System.out.print("El dia " + dia + " hay " + nombreMes); 
      break;
      case "jueves":
      nombreMes = "Entornos de desarrollo";
      System.out.print("El dia " + dia + " hay " + nombreMes); 
      break;
      case "viernes":
      nombreMes = "Sistemas informaticos";
      System.out.print("El dia " + dia + " hay " + nombreMes); 
      break;
      default:
      System.out.print("Ese dia no tenemos nada :) ");
    }
   
  }
}
