/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_aritmeticas;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class metodo_operaciones {
     public static void calculadora(int iteraciones) {
        int menu, lado=0, base=0, altura=0;
        double pi=3.1416, radio=0, b=0, h=03, area;
        
        main_operaciones obj=new main_operaciones();
        main_operaciones obj1=new main_operaciones(radio);
        main_operaciones obj2=new main_operaciones(lado);
        main_operaciones obj3=new main_operaciones(base, altura);
        main_operaciones obj4=new main_operaciones(b, h);
        
        do{
            menu=Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción: \n1.Circulo"
                                                                               + "\n2.cuadrado"
                                                                               + "\n3.rectangulo"
                                                                               + "\n4.Triángulo")); 
        switch(menu){
        
            case 1:               
                obj1.radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese radio: "));
                
                area=pi*obj1.radio*obj1.radio;
                
                JOptionPane.showMessageDialog(null, "El área del círculo es: =" + area);
            break;
            
            case 2:
                obj2.lado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado: "));
                
                area=obj2.lado*obj2.lado;
                
                JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + area);
            break;
            
            case 3:obj3.base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese base: "));
                obj3.altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura: "));
        
                area=obj3.base*obj3.altura;
                
                JOptionPane.showMessageDialog(null, "El área del rectángulo:  " + area);
                
            break;
                
            case 4:    
                obj4.b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese base: "));
                obj4.h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura: "));
                
                area=(obj4.b*obj4.h)/2;
                JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
            break;
            
            default: 
                JOptionPane.showMessageDialog(null, "Opción Invalida. Vuelva a intentarlo.");
        }
     }while(menu!=4);
   }      
}
