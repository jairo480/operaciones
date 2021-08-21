/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_aritmeticas;

/**
 *
 * @author Admin
 */
public class main_operaciones extends metodo_operaciones {
    int lado, base, altura;
    double radio, b, h, area;
    
    public main_operaciones(){}
    
    public main_operaciones(double radio){
        this.radio=radio;
    }
    
    public main_operaciones(int lado){
        this.lado=lado;
    }
    
    public main_operaciones(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
 
    public main_operaciones(double b, double h){
        this.b=b;
        this.h=h;
    }
}
