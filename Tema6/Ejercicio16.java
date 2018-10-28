public class Ejercicio16 {
  public static void main(String[] args)
    throws InterruptedException {
    
    System.out.println("Bienvenido la maquina de tragaperras no fake y no trucada y arruinarte");
    System.out.println("Si consigues tres iguales te llevas el maximo premio, si son solo dos algo menos");
    
    System.out.println("Pulsa la tecla Entrar para empezar, coste de la jugada 3 bitcoin");
    System.console().readLine();
    
    int tirada = 0;
    int tirada1 = 0;
    int tirada2 = 0;
    int tirada3 = 0;
    String objeto = "";
    
    while (tirada < 3 ){
      
      int figura = (int)(Math.random()*5);
      switch (figura){
        case 0:
          objeto = "Corason";
          break;
        case 1:
          objeto = "Diamante";
          break;
        case 2:
          objeto = "Herradura";
          break;
        case 3:
          objeto = "Campana";
          break;
        case 4:
          objeto = "Limonada 2.0";
          break;
      }
      System.out.print(objeto + " ");
      tirada++;
      tirada1 = figura;
      if ( tirada == 1){
        tirada2 = figura;
      }
      if ( tirada == 2){
        tirada3 = figura;
      }
      Thread.sleep(1000);
      
    }
    System.out.println();
    if ( (tirada1 == tirada2) && (tirada2 == tirada3) && (tirada3 == tirada1) ){
      System.out.print("Enhorabuena has ganado 5 Iphone XR Plus mis webos");
    } else if ( (tirada1 == tirada2) || (tirada2 == tirada3) || (tirada3 == tirada1) ){
      System.out.print("Has conseguido dos aciertos, tu premios es una patada en la boca");
    } else {
     System.out.print("Eres un parguela, has perdido"); 
    }
    
    
   } 
  
}
