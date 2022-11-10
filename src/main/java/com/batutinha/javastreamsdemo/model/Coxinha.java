package com.batutinha.javastreamsdemo.model;

import com.batutinha.javastreamsdemo.enums.TipoSalgado;

public class Coxinha implements Salgado {

    @Override
    public String getName() {
        return "Coxinha";
    }

    @Override
    public TipoSalgado getType() {
        return TipoSalgado.FRITURA;
    }

    @Override
    public int getCalories() {
        return 400;
    }
}
