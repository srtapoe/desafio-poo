package org.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
public class Dev {

    private String nome;
    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudosBootcamp());
        bootcamp.getDevsNoBootcamp().add(this);
    }

    public void progredir(){
        Optional<Conteudos> conteudo = this.conteudosInscritos
                .stream()
                .findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.out.println("Você não está inscrito em nenhum curso!");
        }

    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudos::calcularXp)
                        .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Dev{\n" +
                "Nome: '" + nome + '\'' + "\n" +
                " ,Inscrito em: " + conteudosInscritos + "\n" +
                ", Concluídos: " + conteudosConcluidos +
                '}';
    }
}
