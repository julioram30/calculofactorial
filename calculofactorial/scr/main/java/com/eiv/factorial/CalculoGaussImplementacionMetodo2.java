package com.eiv.factorial;

public class CalculoGaussImplementacionMetodo2 implements CalculoMatematico {

    @Override
    public long Calcular(int numero) {
        long resultado=0;
        resultado =(numero *(numero+1)/2);
        return resultado;
    }

}
