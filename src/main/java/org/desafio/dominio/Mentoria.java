package org.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Mentoria extends InformacoesComuns{

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
}
