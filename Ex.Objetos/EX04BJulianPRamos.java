public abstract class EX04BJulianPRamos  {
  protected String codigo;
  protected String denominacion;
  protected int pVenta;
  /*
   Hecho por Julián Pérez Ortiz 1º daw
    */
  public EX04BJulianPRamos(){

  }
  public EX04BJulianPRamos(String Codigo){
    this.codigo = Codigo;
  }
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDenominacion() {
    return denominacion;
  }

  public void setDenominacion(String denominacion) {
    this.denominacion = denominacion;
  }

  public int getpVenta() {
    return pVenta;
  }

  public void setpVenta(int pVenta) {
    this.pVenta = pVenta;
  }
  @Override
  public String toString(){
    String texto;
    texto = "El codigo es" + getCodigo() + ", la denominacion es " + getDenominacion() + " y el Precio de venta es de:" + getpVenta() + "\n";
    return texto;
  }
}
