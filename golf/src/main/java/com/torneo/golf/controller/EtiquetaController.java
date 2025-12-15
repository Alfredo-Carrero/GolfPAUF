package com.torneo.golf.controller;

import com.torneo.golf.dto.EtiquetaDTO;
import com.torneo.golf.service.EtiquetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtiquetaController {
    @Autowired
    private EtiquetaService etiquetaService;

    @PostMapping("/api/insertarEtiqueta")
    public EtiquetaDTO insertarEtiqueta(@RequestBody EtiquetaDTO dto){
        return etiquetaService.insertarEtiqueta(dto);
    }
}
