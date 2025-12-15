package com.torneo.golf.service;

import com.torneo.golf.dto.EtiquetaDTO;
import com.torneo.golf.model.Etiqueta;
import com.torneo.golf.repository.EtiquetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtiquetaService {
    @Autowired
    private EtiquetaRepository etiquetaRepository;

    public EtiquetaDTO insertarEtiqueta(EtiquetaDTO dto){
        Etiqueta etiqueta = new Etiqueta(null, dto.getDescripcion());
        etiqueta = etiquetaRepository.save(etiqueta);

        EtiquetaDTO dto1 = new EtiquetaDTO();
        dto1.setId(etiqueta.getId());
        dto1.setDescripcion(etiqueta.getDescripcion());

        return dto1;
    }
}
