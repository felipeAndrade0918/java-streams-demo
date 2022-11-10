package com.batutinha.javastreamsdemo.model;

import com.batutinha.javastreamsdemo.enums.TipoSalgado;

public class PizzaEnrolada implements Salgado {

    @Override
    public String getName() {
        return "Pizza Enrolada";
    }

    @Override
    public TipoSalgado getType() {
        return TipoSalgado.ASSADO;
    }

    @Override
    public int getCalories() {
        return 250;
    }
}
