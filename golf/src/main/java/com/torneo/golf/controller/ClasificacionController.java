package com.torneo.golf.controller;

import com.torneo.golf.dto.ClasificacionDTO;
import com.torneo.golf.service.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClasificacionController {
    @Autowired
    private ClasificacionService clasificacionService;

}
