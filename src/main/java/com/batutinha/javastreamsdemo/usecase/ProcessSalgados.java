package com.batutinha.javastreamsdemo.usecase;

import com.batutinha.javastreamsdemo.model.Salgado;

import java.util.List;

public interface ProcessSalgados {

    List<String> getLowCaloricSalgadosOldSchool();
    List<String> getLowCaloricSalgados();
    int getTotalCalories();
}
