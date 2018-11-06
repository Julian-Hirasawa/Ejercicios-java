public class Ejercicio4 {
  public static void main(String[] args){

    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    for(int i = 0; i < 20; i++){
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];
      System.out.println("El numero " + (i+1) + " con el valor " + numero[i] + ". Tiene un cuadradoc de: " + cuadrado[i] + ". Y un cubo de: " + cubo[i]);
    }



  }
}
