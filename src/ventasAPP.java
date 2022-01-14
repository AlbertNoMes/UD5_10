import javax.swing.JOptionPane;
public class ventasAPP {
 
    public static void main(String[] args) {
 
        String ventas=JOptionPane.showInputDialog("Introduce el número de ventas");
 
        //Pasamos el String a int
        int numVentas=Integer.parseInt(ventas);
 
        //*Declaramos una variable para sumar las ventas,
        int sumaVentas=0;
        for (int var=0;var<numVentas;var++){
            //indico el numero de venta
            ventas=JOptionPane.showInputDialog("Introduce el precio de la venta"+(var+1));
            int venta=Integer.parseInt(ventas);
 
            //Acumulamos el valor de la venta
            sumaVentas=sumaVentas+venta;
        }
        System.out.println(sumaVentas);
    }
}