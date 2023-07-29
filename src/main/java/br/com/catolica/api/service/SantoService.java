package br.com.catolica.api.service;

import br.com.catolica.api.repository.SantoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SantoService {

    @Autowired
    private SantoRepository santoRepository;


}
