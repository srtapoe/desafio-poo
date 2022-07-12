package org.desafio;

import org.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java 8");
        curso1.setDescricao("Curso com objetivo de mostrar as principais mudanças com a versão 8 do Java");
        curso1.setCargaHoraria(8);
        curso1.setNivelConteudo(NivelConteudo.INTERMEDIARIO);


        Curso curso2 = new Curso();
        curso2.setTitulo("Estruturas de dados em Java");
        curso2.setDescricao("Curso com objetivo de apresentar as principais estruturas de dados usadas no Java");
        curso2.setCargaHoraria(10);
        curso2.setNivelConteudo(NivelConteudo.INTERMEDIARIO);

/*
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);

        for (Curso courses : cursos) {
            System.out.println(courses);
        }

*/



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Aprendendo Lambdas");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Coder Girls");
        bootcamp.setDescricao("Java for girls");
        bootcamp.setNivelConteudo(NivelConteudo.INTERMEDIARIO);
        bootcamp.getConteudosBootcamp().add(curso1);
        bootcamp.getConteudosBootcamp().add(curso2);
        bootcamp.getConteudosBootcamp().add(mentoria);

        System.out.println("=========================================================");
        Dev dev1 = new Dev();
        dev1.setNome("Ted Mosby");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();


        System.out.println("=========================================================");
        Dev dev2 = new Dev();
        dev2.setNome("Barney Stinson");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();


        ArrayList<Dev> devs = new ArrayList<>();
        devs.add(dev1);
        devs.add(dev2);

        for (Dev dev : devs){
            System.out.println(dev);
        }


    }

}
