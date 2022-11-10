package com.batutinha.javastreamsdemo.controller;

import com.batutinha.javastreamsdemo.model.Salgado;
import com.batutinha.javastreamsdemo.usecase.GetSortedSalgados;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salgados")
@RequiredArgsConstructor
public class SalgadoLambdaController {

    private final GetSortedSalgados getSortedSalgados;

    @GetMapping("/sorted-by-name")
    public List<Salgado> getSortedSalgadosByName() {
        return getSortedSalgados.byName();
    }

    @GetMapping("/sorted-by-calories")
    public List<Salgado> getSortedSalgadosByCalories() {
        return getSortedSalgados.byCalories();
    }

    @GetMapping("/sorted-by-type-and-calories")
    public List<Salgado> getSortedSalgadosByTypeAndCalories() {
        return getSortedSalgados.byTypeAndCalories();
    }
}