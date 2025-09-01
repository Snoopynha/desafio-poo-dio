import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("lógica de programação");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java POO");
        curso2.setDescricao("orientação de objetos com Java");
        curso2.setCargaHoraria(40);

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        */

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("tire suas dúvidas em Java");
        mentoria1.setData(LocalDate.now());

        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("aprendendo a ter dor de cabeça");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devSnoopynha = new Dev();
        devSnoopynha.setNome("Camilly");
        devSnoopynha.inscreverBootcamp(bootcamp);
        System.out.println("Inscrições de " + devSnoopynha.getNome() + ": " + devSnoopynha.getConteudoInscrito());
        devSnoopynha.progredir();
        System.out.println("Conteúdos concluidos de " + devSnoopynha.getNome() + ": " + devSnoopynha.getConteudoConcluido());
        System.out.println("---");
        System.out.println("Inscrições de " + devSnoopynha.getNome() + ": " + devSnoopynha.getConteudoInscrito());
        System.out.println("XP: " + devSnoopynha.calcularTotalXp());

        System.out.println("----------------------");

        Dev devMelij = new Dev();
        devMelij.setNome("Melissa");
        devMelij.inscreverBootcamp(bootcamp);
        System.out.println("Inscrições de " + devMelij.getNome() + ": " + devMelij.getConteudoInscrito());
        System.out.println("Conteúdos concluidos de " + devMelij.getNome() + ": " + devMelij.getConteudoConcluido());
        System.out.println("---");
        System.out.println("Inscrições de " + devMelij.getNome() + ": " + devMelij.getConteudoInscrito());
        System.out.println("XP: " + devMelij.calcularTotalXp());
    }
}