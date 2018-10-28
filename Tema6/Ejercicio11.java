public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Voy a generar 20 notas al azar y dire si estan suspenso y esas cosas y te dire el numero de esas cosas");
      
      
      int suspensos = 0;
      int suficiente = 0;
      int bien = 0;
      int notable = 0;
      int sobresaliente = 0;
    
    for (int notas = 0; notas < 20; notas++){
      int puntuacion = (int)(Math.random()*11);
      
      
      if (puntuacion < 5 ){
        System.out.println("Con la note de " + puntuacion + " estas suspenso wey :/");
        suspensos++;
      }
      if (puntuacion == 5){
        System.out.println("Con la nota de " + puntuacion + " es suficiente");
        suficiente++;
      } 
      if (puntuacion == 6) {
        System.out.println("Con la nota de " + puntuacion + " es bien ");
        bien++;
      }
      if (puntuacion == 7) {
        System.out.println("Con la nota de " + puntuacion + " es notable");
        notable++;
      }
      if (puntuacion >=8){
        System.out.println("Con la nota de " + puntuacion + " es sobresaliente"); 
        sobresaliente++;
      }
      
      
    }
    System.out.println("---------------");
    System.out.println("El numero total de Suspensos es de: " + suspensos);
    System.out.println("El numero total de Suficientes es de: " + suficiente);
    System.out.println("El numero total de Bien es de: " + bien);
    System.out.println("El numero totat de notables es de: " + notable);
    System.out.println("El numero total de sobresalienets es de: " + sobresaliente);
  }
}

