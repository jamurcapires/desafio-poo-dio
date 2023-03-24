import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java Iniciante");
        cursoJava.setDescricao("Neste curso, aprenda sobre o melhor da técnologia por trás da linguagem Java");
        cursoJava.setCargaHoraria(20);

        Curso cursoSpringBoot = new Curso();
        cursoSpringBoot.setTitulo("Curso Spring Boot");
        cursoSpringBoot.setDescricao("Aprenda sobre uma das maiores ferramentas do Java");
        cursoSpringBoot.setCargaHoraria(6);

        Mentoria mentoriaIntellij = new Mentoria();
        mentoriaIntellij.setTitulo("Mentoria IDE - Intellij");
        mentoriaIntellij.setDescricao("Aprenda os Atalhos, os Truques e Plugins para ser mais produtivo no Intellij");
        mentoriaIntellij.setData(LocalDate.now());

        Mentoria mentoriaMercadoJava = new Mentoria();
        mentoriaMercadoJava.setTitulo("Mentoria - Mercado Java");
        mentoriaMercadoJava.setDescricao("Saiba como ser contratado usando Java");
        mentoriaMercadoJava.setData(LocalDate.now().plusDays(1));

        Bootcamp bootcampJavaPlus = new Bootcamp();
        bootcampJavaPlus.setNome("Bootcamp Java Plus");
        bootcampJavaPlus.setDescricao("Neste Bootcamp aprenda sobre Java e ainda mais!");
        bootcampJavaPlus.getConteudos().add(cursoJava);
        bootcampJavaPlus.getConteudos().add(cursoSpringBoot);
        bootcampJavaPlus.getConteudos().add(mentoriaIntellij);
        bootcampJavaPlus.getConteudos().add(mentoriaMercadoJava);

        System.out.println("---------------------------------------------------------------------");

        Dev devNeymar = new Dev();
        devNeymar.setNome("Neymar");
        devNeymar.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Neymar: " + devNeymar.getConteudoInscritos());
        devNeymar.progredir();
        devNeymar.progredir();
        devNeymar.progredir();
        devNeymar.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Neymar: " + devNeymar.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Neymar: " + devNeymar.getConteudoConcluidos());
        System.out.println("XP: " + devNeymar.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devMarquesini = new Dev();
        devMarquesini.setNome("Marquesini");
        devMarquesini.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Marquesini: " + devMarquesini.getConteudoInscritos());
        devMarquesini.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Marquesini: " + devMarquesini.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Marquesini: " + devMarquesini.getConteudoConcluidos());
        System.out.println("XP: " + devMarquesini.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devAnitta = new Dev();
        devAnitta.setNome("Anitta");
        devAnitta.inscreverBootcamp(bootcampJavaPlus);
        System.out.println("Conteúdos Inscritos Anitta: " + devAnitta.getConteudoInscritos());
        devAnitta.progredir();
        devAnitta.progredir();
        devAnitta.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Anitta: " + devAnitta.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Anitta: " + devAnitta.getConteudoConcluidos());
        System.out.println("XP: " + devAnitta.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");
    }
}
