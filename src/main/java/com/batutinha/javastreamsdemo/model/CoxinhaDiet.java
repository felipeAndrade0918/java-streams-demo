package com.batutinha.javastreamsdemo.model;

import com.batutinha.javastreamsdemo.enums.TipoSalgado;

public class CoxinhaDiet implements Salgado {
    @Override
    public String getName() {
        return "Coxinha Diet";
    }

    @Override
    public TipoSalgado getType() {
        return TipoSalgado.FRITURA;
    }

    @Override
    public int getCalories() {
        return 50;
    }
}
