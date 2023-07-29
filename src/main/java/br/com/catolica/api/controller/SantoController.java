package br.com.catolica.api.controller;

import br.com.catolica.api.repository.SantoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/santos")
public class SantoController {

    @Autowired
    private SantoRepository santoRepository;


}
