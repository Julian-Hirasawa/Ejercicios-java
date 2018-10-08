public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Vamos a calcular el area de un rectangulo, empieza introduciendo primero la base");
    double base = Double.parseDouble (System.console().readLine());
    System.out.println("Ahora introduce la altura");
    double altura = Double.parseDouble (System.console().readLine());
    double area = base * altura;
    System.out.printf("El area del rectangulo es: "+ area + "cm^2");
  }
}
