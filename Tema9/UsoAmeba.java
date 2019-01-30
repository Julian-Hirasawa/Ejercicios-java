public class UsoAmeba {
  public static void main(String[] args){

    Ameba b1 = new Ameba();
    b1.come(2);
    System.out.println(b1);
    Ameba b2 = new Ameba();
    b2.come(4);
    System.out.println(b2);
    b1.come(b2);
    System.out.println(b1);
    System.out.println(b2);
    b2.come(3);
    System.out.println(b2);
  }
}
