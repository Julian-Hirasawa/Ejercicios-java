import java.util.HashMap;
import java.util.Scanner;
/*
Hecho por Julián Pérez Ortiz 1º daw
 */
public class EX02BJulianPerez {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    HashMap<String, String> diccionario = new HashMap<String, String>();
    int eleccion = 0;
    String indice = "";
    String frase = "";
    boolean salir = false;
    do {
      System.out.println("1. Mostrar la frase correspondiente a una palabra. Si no esta la añade");
      System.out.println("2. Borra una palabra");
      System.out.println("3. Muestra por pantalla todo el diccionario");
      System.out.println("4. Para salir");
      eleccion = Integer.parseInt(s.nextLine());
      switch (eleccion){
        case 1:
          System.out.println("Introduce una palabra a buscar en el indice. Introduce -1 para salir");
          indice = s.nextLine();

          if (compruebaPalabra(indice, diccionario)){
            System.out.println("La frase es :" + diccionario.get(indice));
          } else {
            System.out.println("La palabra introducida no esta en el diccionario");
            System.out.println("Introduce una frase para añadir al diccionario");
            frase = s.nextLine();
            diccionario.put(indice,frase);
            System.out.println("Frase añadida");

          }
          break;
        case 2:
          System.out.println("Introduce una palabra a borrar de diccionario");
          indice = s.nextLine();
          if (compruebaPalabra(indice, diccionario)){
            diccionario.remove(indice);
            System.out.println("La palabra se ha borrado correctamente");
          } else {
            System.out.println("La palabra no esta metida");
          }
          break;
        case 3:
          for (HashMap.Entry mostrar: diccionario.entrySet()
               ) {
            System.out.print("La palabra " + mostrar.getKey() + " tiene de frase ");
            System.out.println(mostrar.getValue());
          }
          break;
        case 4:
          salir = true;
          System.out.println("Saliendo del programa");
          break;
      }

    }while (!salir);



  }
  public static boolean compruebaPalabra (String indice, HashMap diccionario){
   boolean esta = false;
    if (diccionario.containsKey(indice)){
      esta = true;
    } else{
      esta = false;
    }
    return esta;
  }
}
