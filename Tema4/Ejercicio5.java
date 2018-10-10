public class Ejercicio5 {
  public static void main(String[] args) {
    
    int hora;
    int minutos;
    
    System.out.println("Introduce una hora y te dire cuantos segundos faltan para llegar al final del dia");
    System.out.println("Introduce la hora: ");
    hora = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce los minutos");
    minutos = Integer.parseInt(System.console().readLine());
    
    int horaSegundos = 0;
    int minutosSegundos = 0;
    int segundosTotal = 0;
    int segundosDia = 86400;
    int segundosRestantes = 0;
    
    horaSegundos = hora * 3600;
    minutosSegundos = minutos * 60;
    segundosTotal = horaSegundos + minutosSegundos;
    segundosRestantes = segundosDia - segundosTotal;
    
    System.out.print("Siendo las " + hora + ":" + minutos + " quedan " + segundosRestantes + " segundos para el final del dia");
  }
}
    
