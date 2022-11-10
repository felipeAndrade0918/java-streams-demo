package com.batutinha.javastreamsdemo.usecase.impl;

import com.batutinha.javastreamsdemo.model.Salgado;
import com.batutinha.javastreamsdemo.usecase.GetSortedSalgados;
import com.batutinha.javastreamsdemo.utils.SalgadoUtils;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class GetSortedSalgadosImpl implements GetSortedSalgados {

    @Override
    public List<Salgado> byName() {
        Comparator<Salgado> comparator = new Comparator<>() {
            @Override
            public int compare(Salgado o1, Salgado o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        return getSalgados(comparator);
    }

    @Override
    public List<Salgado> byCalories() {
        return getSalgados((s1, s2) -> s1.getCalories() - s2.getCalories());
    }

    @Override
    public List<Salgado> byTypeAndCalories() {
        return getSalgados(Comparator.comparing((Salgado salgado) -> salgado.getType().name())
                .thenComparing(Salgado::getCalories));
    }

    private List<Salgado> getSalgados(Comparator<Salgado> comparator) {
        List<Salgado> salgados = SalgadoUtils.getSalgados();

        salgados.sort(comparator);

        return salgados;
    }
}
