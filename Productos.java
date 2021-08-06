package produc;
import java.util.Scanner;

public class Productos {
    private Scanner teclado = new Scanner(System.in);
    private String descripcion;
    private int cantidad;
    private Double valor;
    private Double peso;
    
    
    
    
    
    
    public void recolectarInformacion(){
       
        System.out.println("-----Numero de unidades:----- ");
        setCantidad(getT().nextInt());
        getT().nextLine();
        
        System.out.println("-----Descripcion del material:----- ");
        setDescripcion(getT().nextLine());
        
        
        System.out.println("----- Valor segun la  factura:-----");
        setValor(Double.valueOf(getT().nextLine()));
        
        System.out.println("-----Gasto al peso:----- ");
        setPeso(Double.valueOf(getT().nextLine()));
    }

   
    
    
    
    
    public Scanner getT() {
        return teclado;
    }

    
    public void setT(Scanner t) {
        this.teclado = teclado;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public int getCantidad() {
        return cantidad;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public Double getValor() {
        return valor;
    }

    
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getPeso() {
        return peso;
    }

   
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    
}

