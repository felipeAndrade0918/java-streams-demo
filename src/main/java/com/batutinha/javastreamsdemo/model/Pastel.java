package com.batutinha.javastreamsdemo.model;

import com.batutinha.javastreamsdemo.enums.TipoSalgado;

public class Pastel implements Salgado {

    @Override
    public String getName() {
        return "Pastel";
    }

    @Override
    public TipoSalgado getType() {
        return TipoSalgado.FRITURA;
    }

    @Override
    public int getCalories() {
        return 300;
    }
}
