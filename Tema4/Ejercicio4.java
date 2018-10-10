public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.print("Introduce las horas trabajadas esta semana: ");
    String horas = System.console().readLine();
    int horas1 = Integer.parseInt( horas );
    
    int calculo = 0;
    int calculoExtra = 0;
    int total = 0;
    if (horas1<=40) {
      calculo = (horas1 * 12);
      System.out.print("Las" + horas1 + " de esta semana serian " + calculo + "€");
    } if (horas1>=41) {
      calculo = (40 * 12);
      calculoExtra = ((horas1 - 40) * 16);
      total = (calculo + calculoExtra);
      System.out.print("Las " + horas1 + " de esta semana serian " + total + "€");
    
    }
    
  
  }
}
      
