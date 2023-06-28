
package com.mundopc;

public class Raton extends DispositivoEntrada{
    //Se marca como final para que no se pueda modificar
    private final int idRaton;
    private static int contadorRatones;
    
    //Constructor con argumentos
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}';
    }
    
    
}
