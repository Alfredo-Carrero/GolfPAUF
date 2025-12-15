package com.torneo.golf.service;

import com.torneo.golf.model.Torneo;
import com.torneo.golf.repository.TorneoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneoService {
    @Autowired
    private TorneoRepository torneoRepository;

    public List<Torneo> actualizarPremiosTorneo(String lugar, Integer porcentaje){
        // Buscamos los torneos
        List<Torneo> torneos = torneoRepository.buscarTorneos(lugar);

        if(null != torneos){
            for(Torneo torneo : torneos){
                double premioActual = torneo.getPremioTotal();
                double premioAumentado = premioActual + (torneo.getPremioTotal() * porcentaje);
                torneo.setPremioTotal(premioAumentado);
            }
        }

        return torneoRepository.saveAll(torneos);
    }
}
