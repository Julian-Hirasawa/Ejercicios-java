import java.util.Scanner;
public class PedidosPizza {
  public static void main(String[] args){
    /*
    Scanner s = new Scanner(System.in);
    Pizza p1 = new Pizza();
    System.out.println("Introduce de que tamanio quiere la pizza boludo");
    System.out.println("Mediana o familiar");
    p1.setTamaño(s.nextLine());
    System.out.println("Introduce el tipo de pizza");
    System.out.println("Margarita, Cuatro quesos");
    p1.setTipo(s.nextLine());
    System.out.println(p1.toString());
    p1.setServir();
    System.out.println(p1.toString());
    */
    Pizza p1 = new Pizza("margarita", "mediana");
    Pizza p2 = new Pizza("funghi", "familiar");
    p2.Sirve();
    Pizza p3 = new Pizza("cuatro quesos", "mediana");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.Sirve();
    System.out.println("Pedidas: " + Pizza.getTotalPedidas());
    System.out.println("Servidas: " + Pizza.getTotalServidas());
  }
}
