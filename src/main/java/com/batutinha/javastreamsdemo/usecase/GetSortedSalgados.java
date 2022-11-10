package com.batutinha.javastreamsdemo.usecase;

import com.batutinha.javastreamsdemo.model.Salgado;

import java.util.List;

public interface GetSortedSalgados {

    List<Salgado> byName();
    List<Salgado> byCalories();
    List<Salgado> byTypeAndCalories();
}
