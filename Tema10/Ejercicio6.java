import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    HashMap<String, String> usuarios = new HashMap<String, String>();
    usuarios.put("Illyas","69");
    usuarios.put("Yui", "Hirasawa");
    usuarios.put("777","Vegetta");



    System.out.println(usuarios.get("Illyas"));
    int intentos = 3;
    boolean correcta = false;
    String usuario;
    String contraseña;
   // System.out.println(usuarios.entrySet());
    for (HashMap.Entry pareja: usuarios.entrySet()) {
      System.out.print(pareja.getKey() + "gfd");
      System.out.println(pareja.getValue());
    }
    do {
      System.out.println("Introduce el usuario");
      usuario = s.nextLine();
      if (usuarios.containsKey(usuario)){
        System.out.println("Introduce la contraseña");
        contraseña = s.nextLine();
        if (usuarios.get(usuario).equals(contraseña)){
          correcta = true;
        } else {
          System.out.println("Contraseña incorrecta");
        }
      } else {
        System.out.println("usuario incorrecto");
      }
      intentos--;
    } while ( (intentos >0) && (!correcta));
    if (correcta){
      System.out.println("has accedido al sistema chorrimanguela 3000");
    }

  }
}
