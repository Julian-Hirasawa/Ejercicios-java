public class Ejercicio0 {
  public static void main(String[] args) {
    System.out.println("Vamos a calcular tu salario semanal en base a las horas trabajadas, a razon de 12€ la hora");
    System.out.print("Introduce las horas trabajadas esta semana: ");
    double horas = Double.parseDouble (System.console().readLine());
    System.out.print("Tu salario de esta semana es de : " + (horas * 12) + " euros");
  }
}
