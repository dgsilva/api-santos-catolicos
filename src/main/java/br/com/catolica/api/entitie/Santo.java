package br.com.catolica.api.entitie;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_santos")
public class Santo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSanto;
    private String nomeSanto;

    private String oracao;

    private String diadoSanto;

    private String historiaSanto;

}
