public class buclefor {
  public static void main(String[] args){
    int laVoluntad;
    
    System.out.print("dime cuantos numeros quieres que te escriba qeq");

    String s = System.console().readLine(); 
    laVoluntad = Integer.parseInt(s);

    for (int i=1; i <= laVoluntad; i+=2) {
      System.out.println(i);
    }

}
}
