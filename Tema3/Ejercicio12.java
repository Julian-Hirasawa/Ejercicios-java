public class Ejercicio12 {
  public static void main(String[] args) {
    
    
    
    System.out.println("Introduce la nota del primer examen: ");
    double notaPrimera = Double.parseDouble(System.console().readLine());
    System.out.println("Ahora introducel la nota que quiere sacar en el trimestre...: ");
    double notaTrimestre = Double.parseDouble(System.console().readLine());
    
    double notaSegundo = ((notaTrimestre * 100) - (notaPrimera * 40)) / 60;
    
    System.out.printf("Tienes que sacar un %.2f en el segundo examen para tener un  " + notaTrimestre + " en el trimestre",notaSegundo);
  }
}
