package com.batutinha.javastreamsdemo.usecase.impl;

import com.batutinha.javastreamsdemo.model.Salgado;
import com.batutinha.javastreamsdemo.usecase.ProcessSalgados;
import com.batutinha.javastreamsdemo.utils.SalgadoUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@Service
public class ProcessSalgadosImpl implements ProcessSalgados {

    @Override
    public List<String> getLowCaloricSalgadosOldSchool() {
        List<Salgado> salgados = SalgadoUtils.getSalgados();

        List<Salgado> lowCaloricSalgados = new ArrayList<>();

        for (Salgado salgado : salgados) {
            if (salgado.getCalories() <= 250) {
                lowCaloricSalgados.add(salgado);
            }
        }

        lowCaloricSalgados.sort(new Comparator<Salgado>() {
            @Override
            public int compare(Salgado o1, Salgado o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });

        List<String> lowCaloricSalgadosNames = new ArrayList<>();

        for (Salgado lowCaloricSalgado : lowCaloricSalgados) {
            lowCaloricSalgadosNames.add(lowCaloricSalgado.getName());
        }

        return lowCaloricSalgadosNames;
    }

    @Override
    public List<String> getLowCaloricSalgados() {
        return SalgadoUtils.getSalgados().stream()
                .filter(salgado -> salgado.getCalories() <= 250)
                .sorted(comparing(Salgado::getName))
                .map(Salgado::getName)
                .collect(Collectors.toList());
    }

    @Override
    public int getTotalCalories() {
        return SalgadoUtils.getSalgados().stream()
                .mapToInt(Salgado::getCalories)
                .sum();
    }
}
