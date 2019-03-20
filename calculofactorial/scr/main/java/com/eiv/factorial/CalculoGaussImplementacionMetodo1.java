package com.eiv.factorial;

public class CalculoGaussImplementacionMetodo1 implements CalculoMatematico {

    @Override
    public long Calcular(int numero) {
        long resultado=0;
        
        for(int i=1;i>=numero;i++) {resultado=i;}
        
        return resultado;
    }

}
