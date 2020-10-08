package Agenda;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String sexo;
    private ArrayList<Compromisso> compromisso = new ArrayList<Compromisso>();
    
    public Pessoa(){}


    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Compromisso getCompromisso(int index) {
        return compromisso.get(index);
    }

    public void setCompromisso(Compromisso compromisso) {
        this.compromisso.add(compromisso);
    }
    
    public ArrayList<Compromisso> getCompromissos() {
        return this.compromisso;
    }
    
}