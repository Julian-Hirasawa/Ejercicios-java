public class Ejercicio2 {
  public static void main(String[] args){
    
    System.out.println("Introduce una hora y te saludare");
    String x = System.console().readLine();
    int hora = Integer.parseInt( x );
  
  
   
    if ((hora >= 6) && (hora <= 12 )) { 
     System.out.print("Buenos Dias");
    } else if ((hora >= 12) && (hora <= 20)) {
    System.out.print("Buenas tardes");
    } else if (((hora >= 21) && (hora <= 24)) || ((hora >=0) && (hora <=5))) {
      System.out.print("Buenas noches");
    } else {
      System.out.print("Error 4040404040");
    
  }
}
}


