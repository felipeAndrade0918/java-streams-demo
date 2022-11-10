package com.batutinha.javastreamsdemo.controller;

import com.batutinha.javastreamsdemo.usecase.ProcessSalgados;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salgados/streams")
@RequiredArgsConstructor
public class SalgadoStreamsController {

    private final ProcessSalgados processSalgados;

    @GetMapping("/low-caloric-old-school")
    public List<String> getLowCaloricSalgadosOldSchool() {
        return processSalgados.getLowCaloricSalgadosOldSchool();
    }

    @GetMapping("/low-caloric")
    public List<String> getLowCaloricSalgados() {
        return processSalgados.getLowCaloricSalgados();
    }

    @GetMapping("/total-calories")
    public int getTotalCalories() {
        return processSalgados.getTotalCalories();
    }

}