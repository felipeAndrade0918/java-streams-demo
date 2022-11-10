package com.batutinha.javastreamsdemo.utils;

import com.batutinha.javastreamsdemo.model.*;

import java.util.Arrays;
import java.util.List;

public class SalgadoUtils {

    public static List<Salgado> getSalgados() {
        return Arrays.asList(new Coxinha(), new PizzaEnrolada(), new Esfiha(), new Pastel(), new CoxinhaDiet());
    }
}
