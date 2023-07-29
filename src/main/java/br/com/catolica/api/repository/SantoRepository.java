package br.com.catolica.api.repository;

import br.com.catolica.api.entitie.Santo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SantoRepository extends JpaRepository<Santo, Long> {
}
