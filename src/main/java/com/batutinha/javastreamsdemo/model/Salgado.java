package com.batutinha.javastreamsdemo.model;

import com.batutinha.javastreamsdemo.enums.TipoSalgado;

import java.math.BigDecimal;

public interface Salgado {

    String getName();

    TipoSalgado getType();

    int getCalories();
}
