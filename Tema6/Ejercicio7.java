public class Ejercicio7 {
  public static void main(String[] args) {
    
   
   System.out.println("Vamos a mostrar la quiniela para esta jornada");
   
   int partidos = 14;
   String apuesta = "";
   int numeroEquipo = 0;
   for ( int x = 0; x < 15 ; x ++){
     
     int aleatorio = (int)(Math.random()*3);
     
     switch (aleatorio) {
       case 0:
       apuesta = "1";
       break;
       case 1:
       apuesta = "X";
       break;
       case 2:
       apuesta = "2";
       break;
     }
     
     System.out.print("Equipo " + (numeroEquipo+1) + " VS " + "Equipo " + (numeroEquipo+2) + " [" +  apuesta  + "] - ");
     
     int aleatorio1 = (int)(Math.random()*3);
     
     switch (aleatorio1) {
       case 0:
       apuesta = "1";
       break;
       case 1:
       apuesta = "X";
       break;
       case 2:
       apuesta = "2";
       break;
     }
     System.out.print("Equipo " + (numeroEquipo+1) + " VS " + "Equipo " + (numeroEquipo+2)  + " [" + apuesta + "] - ");
     
     int aleatorio2 = (int)(Math.random()*3);
     
     switch (aleatorio2) {
       case 0:
       apuesta = "1";
       break;
       case 1:
       apuesta = "X";
       break;
       case 2:
       apuesta = "2";
       break;
     }
     System.out.print("Equipo " + (numeroEquipo+1) + " VS " + "Equipo " + (numeroEquipo+2)  + " [" + apuesta + "]");
     System.out.println();
     
     numeroEquipo +=2;
     
   }
    
    
    
    
    
    
    
    
  }
}
