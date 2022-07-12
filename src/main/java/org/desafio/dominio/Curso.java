package org.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudos {

    private int cargaHoraria;

    public Curso(){}

    @Override
    public String toString() {
        return "Curso{ \n" +
                "C.H: " + cargaHoraria +
                "\n , Título: '" + titulo + '\'' +
                "\n , Descrição: '" + descricao + '\'' +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
