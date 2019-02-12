import java.util.ArrayList;
import java.util.Scanner;
/*
Hecho por Julián Pérez Ortiz 1º daw
 */
public class EX03AJPCola {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    ArrayList<EX03AJulianPerez> personas = new ArrayList<EX03AJulianPerez>();
    boolean salir = false;
    int opcion = 0;
    String dni;
    String nombre;
    do {
      System.out.println("1. Llegada de una persona a la cola");
      System.out.println("2. Atención de la persona a la ue le toca la cola");
      System.out.println("3. Mostar la gente que hay en la cola");
      System.out.println("4. salir");
      opcion = Integer.parseInt(s.nextLine());
      switch (opcion){
        case 1:
          System.out.println("Entrando una nueva persona a la cola");
          System.out.println("Introduce el DNI de la persona");
          dni = s.nextLine();
          System.out.println("Introduce el nombre");
          nombre = s.nextLine();
          entraPersona(dni,nombre,personas);
          break;
        case 2:
          System.out.println("Atendiendo al primero de la cola");
          if (!(compruebaCola(personas))){
            atiendePersona(personas);
          } else{
            System.out.println("No hay ni cristo en la cola");
          }
          break;
        case 3:
          if (!(compruebaCola(personas))){
            for (EX03AJulianPerez gente: personas
                 ) {
              System.out.println(gente);
            }
          }
          break;
        case 4:
          System.out.println("Cerrando el chiringito");
          salir = true;
          break;
      }
    }while (!salir);

  }
  public static void entraPersona (String dni, String nombre, ArrayList personas){
    personas.add(new EX03AJulianPerez(dni, nombre));
    System.out.println("Añadido a la cola correctamente");
  }
  public static boolean compruebaCola(ArrayList persona){
    boolean hayCola;
    hayCola = persona.isEmpty();
    return hayCola;
  }
  public static void atiendePersona(ArrayList persona){
    System.out.println("Atendiendo a: " + persona.get(0));
    persona.remove(0);
    System.out.println("Se ha atendido al primero de la cola");
  }
}
