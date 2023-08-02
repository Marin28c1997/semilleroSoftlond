import javax.swing.JOptionPane;

public class tablaMultiplicar {
        public static void tablaMulti() {
            int[][] tablas = new int[10][10];
    
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tablas[i][j] = (i + 1) * (j + 1);
                }
            }

            for (int i = 0; i < 10; i++) {
                 JOptionPane.showMessageDialog(null,"Tabla del " + (i + 1) + ":");
                System.out.println("Tabla del " + (i + 1) + ":");
                for (int j = 0; j < 10; j++) {
                    System.out.println((i + 1) + " x " + (j + 1) + " = " + tablas[i][j]);
                }
            }
             JOptionPane.showMessageDialog(null,"En la consola puede ver el resultado de las tablas");
        }    
}
