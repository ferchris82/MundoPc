package com.mundopc;

public class Teclado extends DispositivoEntrada {

    //Se marca como final para que no se pueda modificar
    private final int idTeclado;
    private static int contadorTeclados;

    //Constructor con argumentos
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() + '}';
    }
}
