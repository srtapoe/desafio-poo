package org.desafio;

import org.desafio.dominio.Curso;
import org.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java 8");
        curso.setDescricao("Curso com objetivo de mostrar as principais mudanças com a versão 8 do Java");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        System.out.println("=========================================================");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Aprendendo Lambdas");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

    }

}
