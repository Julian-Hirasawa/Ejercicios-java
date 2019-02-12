public class Gestimal {
  public String codigo;
  public String descripcion;
  public int precioCompra;
  public int precioVenta;
  public int stock;

  public Gestimal(){
    this.codigo = "nada";
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(int precioCompra) {
    this.precioCompra = precioCompra;
  }

  public int getPrecioVenta() {
    return precioVenta;

  }

  public void setPrecioVenta(int precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }



  @Override
  public String toString() {
    return "Gestimal{" +
      "codigo=" + codigo +
      ", descripcion='" + descripcion + '\'' +
      ", precioCompra=" + precioCompra +
      ", precioVenta=" + precioVenta +
      ", stock=" + stock +
      '}';
  }
}
