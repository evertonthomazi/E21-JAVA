package exercicioOOB;
import java.util.Scanner;

public class Agenda {
    
    public static void main(String[] args) {
        Scanner scEntrada = new Scanner(System.in);
        Pessoa compromissoPessoa = new Pessoa();
        
        System.out.println("Informe seu nome");
        compromissoPessoa.setNome(scEntrada.nextLine());
        
        System.out.println("Informe o seu sexo");
        compromissoPessoa.setSexo(scEntrada.nextLine());
        
        System.out.println("Quantos compromissos você quer adicionar?");
        int qtdeCompromisso = Integer.parseInt(scEntrada.next());
        
        for (int i = 0; i < qtdeCompromisso; i++) {
            Compromisso compromisso = new Compromisso();
            System.out.println("Qual o titulo do compromisso?");
            compromisso.setTitulo(scEntrada.next());

            System.out.println("Qual o tipo do compromisso?");
            compromisso.setTipo(scEntrada.next());

            System.out.println("Qual a data do compromisso?");
            compromisso.setData(scEntrada.next());
            
            System.out.println("Qual o local do compromisso?");
            compromisso.setLocal(scEntrada.next());
            
            compromissoPessoa.setCompromisso(compromisso);
        }
        
        System.out.println("Nome:" + compromissoPessoa.getNome());
        for (int i = 0; i < compromissoPessoa.getCompromissos().size(); i++) {
            System.out.println("Titulo :" + compromissoPessoa.getCompromisso(i).getTitulo());
            System.out.println("Tipo :" + compromissoPessoa.getCompromisso(i).getTipo());
            System.out.println("Data :" + compromissoPessoa.getCompromisso(i).getData());
            System.out.println("Local :" + compromissoPessoa.getCompromisso(i).getLocal());
            System.out.println("=====================");
        }
        
        scEntrada.close();
    }
}
