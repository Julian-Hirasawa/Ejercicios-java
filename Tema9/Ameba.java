public class Ameba {

 public int peso;

 public Ameba(){
   this.peso = 3;
 }

  public int getPeso() {
    return peso;
  }
  public void come (int gramos){
  this.peso += gramos - 1;
  }
  public void come (Ameba a){
   this.peso += a.getPeso() - 1;
   a.peso =0;
  }
  @Override
  public String toString(){
   String resultado;
   resultado = "Soy una ameba y peso " + getPeso() + " microgramos";
   return resultado;
  }

}
