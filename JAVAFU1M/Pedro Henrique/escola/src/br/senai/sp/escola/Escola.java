package br.senai.sp.escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        /** Declara Variaveis */
        String nomeAluno;
        String disciplina;
        String professor;
        int frequencia;
        int nota1;
        int nota2;
        float mediaAluno;
        String situacaoAluno;
        boolean continuar = true;

        /** Instanciar o teclado */
        Scanner teclado = new Scanner(System.in);

        while (continuar) {

            /** coleta dados */
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.print("ola prof, qual seu nome: ");
            professor = teclado.nextLine();
            System.out.print("informe o nome do seu aluno: ");
            nomeAluno = teclado.nextLine();
            System.out.println("Informe sua disciplina: ");
            disciplina = teclado.nextLine();
            System.out.println("Informe a frequencia do aluno: ");
            frequencia = teclado.nextInt();
            System.out.println("Informe a nota 1: ");
            nota1 = teclado.nextInt();
            System.out.println("informe a nota 2: ");
            nota2 = teclado.nextInt();
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");


            /** Avaliação do Aluno */

            boolean validacao = ("vitor".equalsIgnoreCase(professor));

            System.out.println(validacao);

            mediaAluno = (nota1 + nota2) / 2;

            if (mediaAluno >= 7 && frequencia >= 75 && !validacao || mediaAluno >= 6 && frequencia >= 90 && !validacao) {
                situacaoAluno = "aprovado";
            } else {
                situacaoAluno = "reprovado";

            }/** relatório */

            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.print("Olá prof° " + professor);
            System.out.println("A dsiciplina avaliada é: " + disciplina);
            System.out.println("O nome do aluno avaliado é : " + nomeAluno);
            System.out.println("A frequencia do aluno é : " + frequencia);
            System.out.println("A média do aluno é : " + mediaAluno);
            System.out.println("A situação do aluno é: " + situacaoAluno);
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        }

        System.out.println("Deseja cadastrar outro aluno ?");
        String respProf = teclado.next();

        if(respProf.equalsIgnoreCase("nao")) {
            continuar = false;
        }


        System.out.println("Cadastros finalizados com Sucesso");


    }





}
