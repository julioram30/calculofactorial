package com.eiv.factorial;

public class CalculoFactorialAlt2Impl implements CalculoFactorial {

    @Override
    public long Calcular(int numero) {
        long resultado=1;
        if (numero == 1) {
            return numero;
        }
        else {
        resultado=Calcular(numero -1) * numero;
        return resultado;}
    }

}
