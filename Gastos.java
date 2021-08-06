package Gastos;
import java.util.Scanner;

public class Gastos {
    private Scanner teclado = new Scanner(System.in);
    private Double seguro;
    private Double flete;
    private Double aduana;
    private Double acarreo;
    private Double banco;
    

    
    
    
    
    
    public void ObtenerInformacion(){
        System.out.println("-----  Seguros:----- ");
        setSeguro(Double.valueOf(gets().nextLine()));
        System.out.println("-----  Fletes:----- ");
        setFlete(Double.valueOf(gets().nextLine()));
        System.out.println("-----  Aduanas:----- ");
        setAduana(Double.valueOf(gets().nextLine()));
        System.out.println("-----  Acarreos:----- ");
        setAcarreo(Double.valueOf(gets().nextLine()));
        System.out.println("-----  Bancos:----- "); 
        setBanco(Double.valueOf(gets().nextLine()));
    }
    
    
    

    public Scanner gets() {
        return teclado;
    }

    public void setT(Scanner teclado) {
        this.teclado = teclado;
    }

    public Double getSeguro() {
        return seguro;
    }

    public void setSeguro(Double seguro) {
        this.seguro = seguro;
    }

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public Double getAduana() {
        return aduana;
    }

    public void setAduana(Double aduana) {
        this.aduana = aduana;
    }

    public Double getAcarreo() {
        return acarreo;
    }

    public void setAcarreo(Double acarreo) {
        this.acarreo = acarreo;
    }

    public Double getBanco() {
        return banco;
    }

    public void setBanco(Double banco) {
        this.banco = banco;
    }
}

    
