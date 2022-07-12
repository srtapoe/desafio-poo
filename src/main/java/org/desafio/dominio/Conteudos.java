package org.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudos {

   protected static final double XP_PADRAO = 10;
    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();


}
