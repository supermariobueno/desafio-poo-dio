package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição do curso Java");
        curso1.setCargaHoraria(9);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso C#");
        curso1.setDescricao("descrição do curso C#");
        curso1.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("mentoria de Java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT");
        bootcamp.setDescricao("Insert description here");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMario = new Dev();
        devMario.setNome("Mario");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devMario.getConteudosInscritos());
        devMario.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devMario.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularTotalXp());

        System.out.println("=========");

        Dev devJosefina = new Dev();
        devJosefina.setNome("Josefina");
        devJosefina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJosefina.getConteudosInscritos());
        devJosefina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devJosefina.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devJosefina.getConteudosConcluidos());
        System.out.println("Calcular XP: " + devJosefina.calcularTotalXp());

        System.out.println("=========");

        }


    }

