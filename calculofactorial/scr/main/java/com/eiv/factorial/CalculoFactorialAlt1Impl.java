package com.eiv.factorial;

public class CalculoFactorialAlt1Impl implements CalculoFactorial {

    @Override
    public long Calcular(int numero) {
        long resultado=1;
        for(int i=1;i< numero;i++) {
            resultado=resultado * i;
        }    
        return resultado;
    }

}
