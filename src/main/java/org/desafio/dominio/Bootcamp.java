package org.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();
}
