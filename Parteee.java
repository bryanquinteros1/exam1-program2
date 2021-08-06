/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parteee;
import Gastos.Gastos;
import produc.Productos;
import Prorrateo.prorrateo;
import java.util.Scanner;



public class Parteee{
    private static Scanner t = new Scanner(System.in);
    public static void main(String[] args) 
 
            
            
            
    {
        System.out.println("-----Numero de unidades-----");
        int num = t.nextInt();
        t.nextLine();
        prorrateo prorrateo = new prorrateo(num);
        
        Gastos gastos = new Gastos();
        for (int i = 0; i < num; i++) {
            Productos producto = new Productos();
            producto.recolectarInformacion();
            prorrateo.agregaVendedorMatriz(producto);
        }
        
        
        
        gastos.ObtenerInformacion();
        prorrateo.agregaGastos(gastos);
        prorrateo.ejecutar();
    }
}


