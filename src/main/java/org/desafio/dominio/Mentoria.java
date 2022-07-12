package org.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Mentoria extends Conteudos {

   private LocalDate data;

   public Mentoria(){}

    @Override
    public String toString() {
        return "Mentoria{" +
                "data: " + data +
                "\n , titulo:'" + titulo + '\'' +
                "\n , descricao:'" + descricao + '\'' +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO +20;
    }
}
