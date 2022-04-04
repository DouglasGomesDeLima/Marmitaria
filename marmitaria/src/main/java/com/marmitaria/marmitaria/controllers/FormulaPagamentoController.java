package com.marmitaria.marmitaria.controllers;

import com.marmitaria.marmitaria.services.FormulaPagamentoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("/")
@RequestMapping("/")

public class FormulaPagamentoController {

    final FormulaPagamentoService FormulaPagamentoService;

    public FormulaPagamentoController(FormulaPagamentoService formulaPagamentoService) {
        this.FormulaPagamentoService = formulaPagamentoService;
    }
    
}