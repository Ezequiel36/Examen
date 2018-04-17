package kevinmartinez;

import javax.swing.JOptionPane;

public class KevinMartinez
{

    public static void main(String[] args)
    {
        int Op = 0;
        
        Op=Integer.parseInt(JOptionPane.showInputDialog("--------------Menu--------------\n"+
                                                        "1-Agregar Producto\n"+
                                                        "2-Calcular Producto\n"+
                                                        "3-Salir"));
        
        if(Op==1)
        {
            String Nproducto;
            int Cantidad;
            double Precio;            
            
            Nproducto=JOptionPane.showInputDialog("Ingrese nombre de productos: ");
            Cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos: "));
            Precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio de productos: "));
        }
        else if(Op==2)
        {
            
        }
        else
        {
            System.exit(0);                          
        }
        
    }
    
}
