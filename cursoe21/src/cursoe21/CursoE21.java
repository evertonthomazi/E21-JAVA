package cursoe21;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CursoE21 {
    
    public static void exercicioUm() {
        int[] vetorNumeros = new int[20];
        int[] vetorPares = new int[20];
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            vetorNumeros[i] = ThreadLocalRandom.current().nextInt(1, 200);
            System.out.print(vetorNumeros[i] + ", ");
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i] % 2 == 0) {
                vetorPares[i] = vetorNumeros[i];
            } else {
                vetorPares[i] = 0;
            }
            System.out.print(vetorPares[i] + ", ");
        }
        
    }
    
    public static void exercicioDois() {
        int[][] matrizValores = new int[10][5];

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j == 0) {
                            System.out.print("| ");
                        }
                        matrizValores[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
                        System.out.print(matrizValores[i][j] + " ");
                        if (j == 4) {
                            System.out.print(" |");
                        }
                    }
                    System.out.println("");
        }
    }
    
    public static void exercicioTres() {
        Scanner scEntrada = new Scanner(System.in);
        Pessoa usuario = new Pessoa();
        String nome;
        String sexo;
        int idade;
        
        System.out.println("Informe seu nome");
        nome = scEntrada.nextLine();
        
        System.out.println("Informe sua idade");
        idade = scEntrada.nextInt();
        
        System.out.println("Informe seu sexo");
        sexo = scEntrada.nextLine();
        
        if(!"".equals(nome) && !"".equals(idade) && !"".equals(sexo)) {
              usuario = new Pessoa(nome, idade, sexo);
        } else if (!"".equals(nome)) {
            usuario = new Pessoa(nome);
        } else if (!"".equals(idade)) {
            usuario = new Pessoa(idade);
        } else if (!"".equals(sexo)) {
            usuario = new Pessoa(sexo);
        }
        
        System.out.println("Nome: " + usuario.getNome() + " sua idade é: " + usuario.getIdade() + " seu sexo é: " + usuario.getSexo());
    }
    
    public static void exercicioQuatro() {
        Pessoa usuario = new Pessoa();
        Carro carro = new Carro();
        String nome;
        String modelo;
        int ano;
        Scanner scEntrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        nome = scEntrada.nextLine();
        
        System.out.println("Qual seu carro?");
        modelo = scEntrada.nextLine().toUpperCase();
        
        System.out.println("Qual o ano do carro?");
        ano = scEntrada.nextInt();
        
        if(!"".equals(nome) && !"".equals(modelo) && !"".equals(ano)) {
            usuario = new Pessoa(nome);
            carro = new Carro(ano, modelo);
        } else if(!"".equals(nome)) {
            usuario = new Pessoa(nome);
        } else if(!"".equals(ano)) {
            carro = new Carro(ano);
        } else if(!"".equals(modelo)) {
            carro = new Carro(modelo);
        }
        
        System.out.println("Meu nome é " + usuario.getNome() + " meu carro é um " + carro.getModeloCarro() + " e o ano é "  + carro.getAnoAutomovel());
    }
}
