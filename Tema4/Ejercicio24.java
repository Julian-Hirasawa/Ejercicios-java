public class Ejercicio24 {
  public static void main(String[] args) {
    
   
    int sueldoBase = 0;
    double sueldoNeto = 0;
    double sueldoNetoTotal = 0;
    double sueldoFinal = 0;
    
    System.out.println("Vamos a calcular tu nomina de este mes");
    System.out.println("Introduce tu cargo de empleado: ");
    System.out.println("1. Prog. junior, 2. Prog. senior, 3. Jefe de Proyecto");
    int cargo = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora introduce si estas (1)Soltero o (2)Casado en numero: ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce los dias que has etado de viaje: ");
    int viajes = Integer.parseInt(System.console().readLine());
    
    switch (cargo) {
      case 1:
      sueldoBase = ((30 * viajes) + 950);
        if (estadoCivil == 1) {
          sueldoNeto = (sueldoBase * 0.25);
          sueldoNetoTotal = (sueldoBase - sueldoNeto);
        } else {
          sueldoNeto = (sueldoBase * 0.20);
          sueldoNetoTotal = (sueldoBase - sueldoNeto);
        }
        break;
        case 2:
      sueldoBase = ((30 * viajes) + 1200);
        if (estadoCivil == 1) {
          sueldoNeto = (sueldoBase * 0.25);
          sueldoNetoTotal = (sueldoBase - sueldoNeto);
        } else {
          sueldoNeto = (sueldoBase * 0.20);
          sueldoNetoTotal = (sueldoBase - sueldoNeto);
        }
        break;
        case 3:
      sueldoBase = ((30 * viajes) + 1600);
        if (estadoCivil == 1) {
          sueldoNeto = (sueldoBase * 0.25);
          sueldoNetoTotal = (sueldoBase - sueldoNeto);
        } else {
          sueldoNeto = (sueldoBase * 0.20);
          sueldoNetoTotal = (sueldoBase - sueldoNeto);
        }
        break;
        default:
        System.out.print("error");
      }
      System.out.print("Con la categoria de :" + cargo + " y con " + viajes + "dias de viajes, y estando " + estadoCivil + ", tendrias un sueldo Neto de: " + sueldoNetoTotal);
    }
  }
        
        
