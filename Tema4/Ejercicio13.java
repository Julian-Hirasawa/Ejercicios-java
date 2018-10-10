public class Ejercicio13 {
  public static void main(String[] args) {
  
  int a;
  int b;
  int c;
  int aux;
  
  System.out.println("Introduce tres numeros que te los voy a ordenar ok?");
  System.out.print("Introduce el primer numero: ");
  a = Integer.parseInt(System.console().readLine());
  System.out.print("intoduce el segundo numero: ");
  b = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el tercer numero: ");
  c = Integer.parseInt(System.console().readLine());
  
  if (a > b) {
  aux = a;
  a = b;
  b = aux;
  } if (b > c) {
  aux = b;
  b = c;
  c = aux;
  } if (a > b) {
    aux = a;
    a = b;
    b = aux;
  }
  System.out.print("Los numeros introducidos quedan ordenados de menor a mayor " + a +" < "+ b + " < " + c);
  

}
}
  
