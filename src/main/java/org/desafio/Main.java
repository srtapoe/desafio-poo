package org.desafio;

import org.desafio.dominio.Curso;
import org.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java 8");
        curso1.setDescricao("Curso com objetivo de mostrar as principais mudanças com a versão 8 do Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Kotlin para iniciantes");
        curso2.setDescricao("Curso com objetivo de apresentar a linguagem Kotlin para iniciantes");
        curso2.setCargaHoraria(10);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);

        for (Curso courses : cursos) {
            System.out.println(courses);
        }

        System.out.println("=========================================================");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Aprendendo Lambdas");
        mentoria.setData(LocalDate.now());


    }

}
