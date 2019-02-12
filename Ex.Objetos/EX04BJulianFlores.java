public class EX04BJulianFlores extends EX04BJulianPRamos implements EX04BJulianPrecio {
  private int nFlores;
  private String tipoFlor;
  /*
   Hecho por Julián Pérez Ortiz 1º daw
    */
  public EX04BJulianFlores(){
    super();
    this.nFlores = 3;
    this.tipoFlor = "Rosa";
  }
  public EX04BJulianFlores(String codigo, String denominacion, int precio){
    setCodigo(codigo);
    setDenominacion(denominacion);
    setpVenta(precio);
  }
  public EX04BJulianFlores(String codigo, String denominacion, int precio, int petalos){
    setCodigo(codigo);
    setDenominacion(denominacion);
    setpVenta(precio);
    this.nFlores = petalos;
  }
  public EX04BJulianFlores( String codigo, String denominacion, int precio, String tipo){
    setCodigo(codigo);
    setDenominacion(denominacion);
    setpVenta(precio);
    this.tipoFlor = tipo;
  }
  public EX04BJulianFlores( String codigo, String denominacion, int precio,String tipo, int petalos ){
    setCodigo(codigo);
    setDenominacion(denominacion);
    setpVenta(precio);
    this.tipoFlor = tipo;
    this.nFlores = petalos;
  }

  public int getnFlores() {
    return nFlores;
  }

  public void setnFlores(int nFlores) {
    this.nFlores = nFlores;
  }

  public String getTipoFlor() {
    return tipoFlor;
  }

  public void setTipoFlor(String tipoFlor) {
    this.tipoFlor = tipoFlor;
  }
  @Override
  public void fijarPrecio(int nprecio){
    this.pVenta = nprecio;
    System.out.println("Precio de venta modificado");
  }
  @Override
  public String toString(){
    String texto = super.toString();
    texto += "Es de tipo " + getTipoFlor() + ", y se creo en " + getnFlores();
    return texto;
  }
  @Override
  public void precioVer(){
    System.out.println("El precio de la venta es de: " + this.pVenta);
  }


}
