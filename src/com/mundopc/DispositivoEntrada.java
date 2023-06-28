
package com.mundopc;

public class DispositivoEntrada {
    //Atributos
    private String tipoDeEntrada;
    private String marca;
    
    //Constructor
    public DispositivoEntrada(String tipoEntrada, String marca){
        //inicializar atributos con los valores de los argumentos
        this.tipoDeEntrada = tipoEntrada;
        this.marca = marca;
    }
    //Metodos getter and setter
    public String getTipoDeEntrada() {
        return this.tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoDeEntrada=" + tipoDeEntrada + ", marca=" + marca + '}';
    }
    
    
}
