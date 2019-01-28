public class Pizza {
  public String tamaño;
  public String tipo;
  public String estado;
  private static int pizzasPedidas;
  private static int pizzasServidas;
  public boolean servida;

  public Pizza (String tipo, String tamaño){
    this.tamaño = tamaño;
    this.tipo = tipo;
    this.servida = false;
    pizzasPedidas++;
    this.estado = "pedida";
  }
  /* public void setTamaño (String tamanio){
    this.tamaño = tamanio;
  } */
  public String getTamaño(){
    return tamaño;
  }
  /*
  public void setTipo(String tipo){
    this.tipo = tipo;
  } */
  public String getTipo(){
    return tipo;
  }
  public void Sirve(){
    if (this.estado.equals("servida")){
      System.out.println("Esta Pizza ya se ha servido weye");
    } else {
      this.estado = "servida";
      this.servida = true;
      pizzasServidas++;
    }


  }

  public boolean getSirve(){
    return  servida;
  }
  public static int getTotalPedidas(){
    return pizzasPedidas;
  }
  public static int getTotalServidas(){
    return pizzasServidas;
  }

  public String getEstado(){
    return estado;
  }

 @Override
  public String toString() {
    String pizza;
    pizza = "Pizza " + getTipo() + ", " +  getTamaño() + ", " +  getEstado();
   /* if (getSirve()){
      pizza += "La pizza esta servida \n";
    } else {
      pizza += "La pizza esta pedida \n";
    } */
  //  pizza += "Hay un total de " + getPizzasPedidas() + " pizzas pedidas \n";
  //  pizza += "En total se han servido " + getPizzasServidas() + " pizzas servidas \n";
    return pizza;
  }

}