public class EX03AJulianPerez {
public String dni;
public String nombre;

  /*
  Hecho por Julián Pérez Ortiz 1º daw
   */
public  EX03AJulianPerez(String dni, String nombre){
  this.dni = dni;
  this.nombre = nombre;
}
public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    String nosequeponer;
  //  int pos = 0;
  //  pos++;
    nosequeponer = "El DNI es " + getDni();
    nosequeponer += " y su nombre es " + getNombre();
  //  nosequeponer += " y su posicion en la cola es de " + pos;

    return nosequeponer;
  }
}
