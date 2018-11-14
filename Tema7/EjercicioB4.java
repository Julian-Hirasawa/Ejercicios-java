public class EjercicioB4 {

  public static void main(String[] args)
throws InterruptedException {
      int[][] tabla = new int[4][5];
      int[] tFila = new int[4];
      int[] tColumna = new int[5];


      int sumaColumna = 0;
      int sumaFila = 0;
      int sumaTotal = 0;
      for (int x = 0; x < 4; x++) {
        for (int i = 0; i < 5; i++) {
          tabla[x][i] = (int) (Math.random() * 900) + 100;
          sumaFila += tabla[x][i];

          if (i == 4) {
            tFila[x] = sumaFila;
            sumaFila = 0;
          }

        }

      }

      for (int i = 0; i < 5; i++) {
        for (int x = 0; x < 4; x++) {
          sumaColumna += tabla[x][i];
          if (x == 3) {
            tColumna[i] = sumaColumna;
            sumaColumna = 0;
          }
        }

      }
      // sumamos el Total de la tabla.
      for (int x = 0; x < tFila.length; x++) {
        sumaTotal += tFila[x];
      }
      for (int x = 0; x < tColumna.length; x++) {
        sumaTotal += tColumna[x];
      }

      for (int x = 0; x < 4; x++) {
        for (int i = 0; i < 5; i++) {
          System.out.printf("%14d", tabla[x][i]);
          if (i == 4) {
            Thread.sleep(1000);
            System.out.print("            Fila" + (x + 1) + "º: " + tFila[x]);
          }
          if ((x == 3) && (i == 4)) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
              Thread.sleep(1000);
              System.out.print("  Columna " + (j + 1) + "º " + tColumna[j]);
              if (j == 4) {
                Thread.sleep(1000);
                System.out.print("      Total: " + sumaTotal);
              }
            }
          }

        }
        System.out.println();
      }

    }
  }

