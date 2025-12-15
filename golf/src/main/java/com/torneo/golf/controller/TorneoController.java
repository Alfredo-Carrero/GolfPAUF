package com.torneo.golf.controller;

import com.torneo.golf.model.Jugador;
import com.torneo.golf.model.Torneo;
import com.torneo.golf.service.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TorneoController {
    @Autowired
    private TorneoService torneoService;

    @PostMapping("/api/actualizarPremioTorneos")
    public List<Torneo> actualizarHandicap(@RequestParam("lugar") String lugar, @RequestParam("porcentaje") Integer porcentaje){
        return torneoService.actualizarPremiosTorneo(lugar, porcentaje);
    }
}
