import java.util.ArrayList;
/*
  Hecho por Julián Pérez Ortiz 1º daw
   */
public class EX04BJulianPrueba {
  public static void main(String[] args){
    ArrayList<EX04BJulianPRamos> tienda = new ArrayList<EX04BJulianPRamos>();

    tienda.add(new EX04BJulianPerfumes("Marijuana",2069, "69", "eggs", 7));
    tienda.add(new EX04BJulianFlores());
    tienda.add(new EX04BJulianFlores("34534243Z","daimalos", 69 ));
    tienda.add(new EX04BJulianFlores("87654D", "ni lo se ni me importa",59,"mustia",2547));

    for (EX04BJulianPRamos mostar: tienda
         ) {
      System.out.println(mostar);
    }

    System.out.println("Modificamos el precio de una y lo mostramos con la interefaz");
    EX04BJulianPRamos p1 = new EX04BJulianFlores();
    ((EX04BJulianFlores) p1).fijarPrecio(5464);
    ((EX04BJulianFlores) p1).precioVer();

  }
}
