package projetoheranca;

import Classe.Aluno;
import Classe.Professor;
import java.util.Scanner;

public class ProjetoHeranca {

    public static void main(String[] args) {
        Scanner scEntrada = new Scanner(System.in);
        Professor prof = new Professor("Ramon");
        String turma, opcao;
        boolean continuaInserindo = true;

        System.out.println("Informe o nome da turma");
        turma = scEntrada.nextLine();

        prof.setTurma(turma);

        while (continuaInserindo) {
            System.out.println("Bem vindo!");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Ver alunos");
            System.out.println("0 - Sair");

            opcao = scEntrada.nextLine();

            switch (opcao) {
                case "1":
                    Aluno novoAluno = new Aluno();
                    System.out.println("Inserir o nome do aluno");
                    novoAluno.setTurma(turma);
                    break;
                case "2":
                    break;
                case "0":
                    System.exit(0);
                    break;
            }
        }

    }

}
