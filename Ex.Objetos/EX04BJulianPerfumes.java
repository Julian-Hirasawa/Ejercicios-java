public class EX04BJulianPerfumes extends EX04BJulianPRamos implements EX04BJulianPrecio {
  private String aroma;
  private int añoCreacion;
  /*
 Hecho por Julián Pérez Ortiz 1º daw
  */
 /* public EX04BJulianPerfumes(){
    super();
  } */
  public EX04BJulianPerfumes(String aroma, int añoCreacion, String codigo, String denominacion, int precio){
    setCodigo(codigo);
    setDenominacion(denominacion);
    setpVenta(precio);
    this.aroma = aroma;
    this.añoCreacion = añoCreacion;
  }

  public String getAroma() {
    return aroma;
  }

  public void setAroma(String aroma) {
    this.aroma = aroma;
  }

  public int getAñoCreacion() {
    return añoCreacion;
  }

  public void setAñoCreacion(int añoCreacion) {
    this.añoCreacion = añoCreacion;
  }

  @Override
  public String toString(){
    String texto = super.toString();
    texto += "Es de tipo " + getAroma() + ", y se creo en " + getAñoCreacion();
    return texto;
  }
  @Override
  public void precioVer(){
    System.out.println("El precio de la venta es de: " + this.pVenta);
  }
  @Override
  public void fijarPrecio(int nprecio){
    this.pVenta = nprecio;
    System.out.println("Precio de venta modificado");
  }
}
