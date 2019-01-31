public class Gato {
  public String nombre;
  public int edad;
  public int vidas;

  public Gato(){
    this.vidas = 7;
    this.nombre = "";
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public int getVidas() {
    return vidas;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setVidas(int vidas) {
    this.vidas = vidas;
  }

  @Override
  public String toString() {
    String resultado;
    if (getNombre().equals("")){
      resultado = "El gato es un sin techo y no tiene nombre.";
    } else {
      resultado = "El nombre del gato es " + getNombre() + ".";
    }
    if ( getEdad() >= 0){
      resultado += "Tienen una edad de " + getEdad() + ".";
    } else {
      resultado += " No se sabe la edad del gato. ";
    }
    if ( getVidas() >= 0){
      resultado += "Le quedan " + getVidas() + " vidas";
    } else {
      resultado += "No se sabe cuantas vidas le quedan";
    }

    return  resultado;
  }
}
