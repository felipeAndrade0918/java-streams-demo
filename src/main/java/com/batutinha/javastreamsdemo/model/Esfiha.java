package com.batutinha.javastreamsdemo.model;

import com.batutinha.javastreamsdemo.enums.TipoSalgado;

public class Esfiha implements Salgado {

    @Override
    public String getName() {
        return "Esfiha Assada";
    }

    @Override
    public TipoSalgado getType() {
        return TipoSalgado.ASSADO;
    }

    @Override
    public int getCalories() {
        return 200;
    }
}
