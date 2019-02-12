import java.util.Scanner;

public class Articulos {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Gestimal[] articulos = new Gestimal[50];
    String cod;

   for( int x = 0; x < articulos.length; x++){
      articulos[x] = new Gestimal();
    }
    boolean salir = false;
    int elegido;
    do {
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercancia");
      System.out.println("6. Salida de mercacia");
      System.out.println("7. Salir");
      elegido = Integer.parseInt(s.nextLine());
      switch (elegido){
        case 1: // listado
          for ( int x = 0; x < articulos.length; x++){
            if ( !(articulos[x].getCodigo().equals("nada")))
            System.out.println(articulos[x]);
          }
          break;
        case 2:
          int hueco = 0;
           cod = articulos[0].getCodigo();
          while ( (hueco < articulos.length) && (!(cod.equals("nada")))){
            hueco++;
            if (hueco < articulos.length){
              cod = articulos[hueco].getCodigo();
            }
            if (hueco == articulos.length){
              System.out.println("El pograma esta full");
            }
          }
          boolean codRepe;
          System.out.println("Vamos a crear un nuevo articulo");

          do{
            codRepe = false;
            System.out.println("Introduce el codigo del articulo");
            String codigo = s.nextLine();
            for( int x = 0; x < articulos.length; x++){
              if (articulos[x].getCodigo().equals(codigo)){
                codRepe = true;
              }
            }
            if (!codRepe){
              articulos[hueco].setCodigo(codigo);
            } else {
              System.out.println("Error. Codigo repetido en otro articulo");
            }
          } while (codRepe);
          System.out.println("Introduce una descripcion del articulo ");
          articulos[hueco].setDescripcion(s.nextLine());
          System.out.println("Introduce un precio de compra");
          articulos[hueco].setPrecioCompra(Integer.parseInt(s.nextLine()));
          System.out.println("Introduce un precio de venta");
          articulos[hueco].setPrecioVenta(Integer.parseInt(s.nextLine()));
          System.out.println("introduce un stock inicial ");
          articulos[hueco].setStock(Integer.parseInt(s.nextLine()));
          break;
        case 3:
          boolean articuloborrado;
          do{
            articuloborrado = false;
            System.out.println("Introduce el codigo de un articulo a borrar");
            cod = s.nextLine();
            for ( int x = 0; x < articulos.length; x++){
              if (articulos[x].getCodigo().equals(cod)){
                articulos[x].setCodigo("nada");
                articuloborrado = true;
                System.out.println("Articulo borrado correctamente.");
              }
              if ( (x == ( articulos.length -1)) && (!articuloborrado)){
                System.out.println("El codigo introducido no es correcto.");
              }
            }
          } while ( !articuloborrado);
          break;
        case 4:
          boolean articuloCorrecto;
          int pos;
          do {
            articuloCorrecto = false;
            pos = -1;
            System.out.println("Introduce Codigo del articulo a modificar");
            cod = s.nextLine();
            for (int x = 0; x < articulos.length; x++){
              if (articulos[x].getCodigo().equals(cod)){
                articuloCorrecto = true;
                pos++;
              }
            }
            if (!articuloCorrecto){
              System.out.println("El articulo introducido no es correcto");
            }
          } while (!articuloCorrecto);
          System.out.println("Introduce el parametro a modificar");
          System.out.println("1. El codigo");
          System.out.println("2. La descripcion");
          System.out.println("3. Precio de compra");
          System.out.println("4. El precio de venta");
          System.out.println("5. El stock");
          int introducido = Integer.parseInt(s.nextLine());
          switch (introducido){
            case 1:
              boolean repe;
              do {
                repe = false;
                System.out.println("Introduce el nuevo codigo");
                cod = s.nextLine();
                for( int x = 0; x < articulos.length; x++){
                  if ( articulos[x].getCodigo().equals(cod)){
                    repe = true;
                  }
                  if ( (x == ( articulos.length -1)) && (repe) ){
                    System.out.println("Este codigo ya esta repetido");
                  }
                }
                if (!repe){
                  articulos[pos].setCodigo(cod);
                  System.out.println("El codigo se ha cambiado satisfactoriamente");
                }

              } while (repe);


              break;
            case 2:
              System.out.println("Introduce una nueva descripcion");
              articulos[pos].setDescripcion(s.nextLine());
              System.out.println("Descripcion cambiada");
              break;
            case 3:
              System.out.println("Introduce el nuevo precio de la compra");
              articulos[pos].setPrecioCompra(Integer.parseInt(s.nextLine()));
              break;
            case 4:
              System.out.println("Introduce el nuevo precio de la venta");
              articulos[pos].setPrecioVenta(Integer.parseInt(s.nextLine()));
            break;
              case 5:
                System.out.println("Introduec el nuevo stock");
                articulos[pos].setStock(Integer.parseInt(s.nextLine()));
                break;
          }
        break;
        case 5:
          do{
            articuloCorrecto = false;
            pos = -1;
          System.out.println("Introduce Codigo del articulo a añadir stock");
          cod = s.nextLine();
          for (int x = 0; x < articulos.length; x++){
            if (articulos[x].getCodigo().equals(cod)){
              articuloCorrecto = true;
              pos++;
            }
          }
          if (!articuloCorrecto){
            System.out.println("El articulo introducido no es correcto");
          }
      } while (!articuloCorrecto);
          System.out.println("Introduce el nuevo stock a añadir");
          articulos[pos].setStock(articulos[pos].getStock() + Integer.parseInt(s.nextLine()));
          System.out.println("El Stock total es de" + articulos[pos].getStock());
          break;
        case 6:
          do{
            articuloCorrecto = false;
            pos = -1;
            System.out.println("Introduce Codigo del articulo a quitar stock stock");
            cod = s.nextLine();
            for (int x = 0; x < articulos.length; x++){
              if (articulos[x].getCodigo().equals(cod)){
                articuloCorrecto = true;
                pos++;
              }
            }
            if (!articuloCorrecto){
              System.out.println("El articulo introducido no es correcto");
            }
          } while (!articuloCorrecto);
          System.out.println("Introduce el nuevo stock a quitar");
          articulos[pos].setStock(articulos[pos].getStock() - Integer.parseInt(s.nextLine()));
          System.out.println("El Stock total es de" + articulos[pos].getStock());
          break;
        case 7:
          salir = true;
          break;
      }
    } while (!salir);

  }
}
