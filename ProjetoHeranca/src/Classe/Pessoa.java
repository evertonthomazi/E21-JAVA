package Classe;

import java.util.ArrayList;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private ArrayList<String> materiais = new ArrayList<String>();
    private String turma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getMateriais() {
        return materiais;
    }

    public void setMateriais(ArrayList<String> materiais) {
        this.materiais = materiais;
    }

    public String getMateria(int indice) {
        return materiais.get(indice);
    }

    public void setMateria(String materia) {
        this.materiais.add(materia);
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
