package Agenda;
import java.util.Scanner;

public class Agenda {
    
    public static void main(String[] args) {
        //Scanner para receber entrada de dados
        Scanner scEntrada = new Scanner(System.in);
        //Classe Pessoa criei a variavel compromissoPessoa e declarei como new
        Pessoa compromissoPessoa = new Pessoa();
        
        //Introdução da entrada de dados
        System.out.println("Informe seu nome");
        //Salvar o nome na variavel da classe Pessoa, dentro do objeto nome
        compromissoPessoa.setNome(scEntrada.nextLine());
        //Introdução da entrada de dados
        System.out.println("Informe o seu sexo");
        //Salvar o sexo na variavel da classe Pessoa, dentro do objeto sexo
        compromissoPessoa.setSexo(scEntrada.nextLine());
        //Introdução da entrada de dados
        System.out.println("Quantos compromissos você quer adicionar?");
        //Recebo o valor como string e transformo ele em Int, para fazer a contagem
        int qtdeCompromisso = Integer.parseInt(scEntrada.next());
        
        //Enquanto a variavel i for menor que a quantidade informada o laço repete
        for (int i = 0; i < qtdeCompromisso; i++) {
            //Classe Compromisso criei a variavel compromisso e declarei como new
            Compromisso compromisso = new Compromisso();
            //Introdução da entrada de dados
            System.out.println("Qual o titulo do compromisso?");
            //Salvar o titulo na variavel da classe Compromisso, dentro do objeto titulo
            compromisso.setTitulo(scEntrada.next());
            //Introdução da entrada de dados
            System.out.println("Qual o tipo do compromisso?");
            //Salvar o tipo na variavel da classe Compromisso, dentro do objeto tipo
            compromisso.setTipo(scEntrada.next());
            //Introdução da entrada de dados
            System.out.println("Qual a data do compromisso?");
            //Salvar o data na variavel da classe Compromisso, dentro do objeto data
            compromisso.setData(scEntrada.next());
            //Introdução da entrada de dados
            System.out.println("Qual o local do compromisso?");
            //Salvar o local na variavel da classe Compromisso, dentro do objeto local
            compromisso.setLocal(scEntrada.next());
            //dentro da variavel compromissoPessoa, faço um setCompromisso para salvar os dados da variavel compromisso
            compromissoPessoa.setCompromisso(compromisso);
        }
        //Apresento o nome da pessoa, que esta dentro da variavel compromissoPessoa
        System.out.println("Nome:" + compromissoPessoa.getNome());
        //Enquanto a variavel i for menor que o tamanho do arraylist de compromissos ele repete
        for (int i = 0; i < compromissoPessoa.getCompromissos().size(); i++) {
            //Apresento o titulo do compromisso, que esta na variavel compromissoPessoa no construtor
            System.out.println("Titulo :" + compromissoPessoa.getCompromisso(i).getTitulo());
            //Apresento o tipo do compromisso, que esta na variavel compromissoPessoa no construtor
            System.out.println("Tipo :" + compromissoPessoa.getCompromisso(i).getTipo());
            //Apresento a data do compromisso, que esta na variavel compromissoPessoa no construtor
            System.out.println("Data :" + compromissoPessoa.getCompromisso(i).getData());
            //Apresento o local do compromisso, que esta na variavel compromissoPessoa no construtor
            System.out.println("Local :" + compromissoPessoa.getCompromisso(i).getLocal());
            System.out.println("=====================");
        }
        //fecho a entrada de dados
        scEntrada.close();
    }
}
