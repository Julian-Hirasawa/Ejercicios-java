public class Ejercicio4 {
  public int numerador;
  public int denominador;

  public Ejercicio4 (){
    this.numerador = 0;
    this.denominador = 0;
  }
  public Ejercicio4 (int numero1, int numero2){
    this.numerador = numero1;
    this.denominador = numero2;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getNumerador() {
    return numerador;
  }

  @Override
  public String toString() {
    String algo = "";
    algo = "El numerador es " + this.numerador + " y el denominador es " + this.denominador;
    return algo;
  }
  public int multiplica(){
    int total = 0;
    total = numerador * denominador;
    return total;
  }
  public int divide(){
    int total;
    total = numerador / denominador;
    return total;
  }
}
