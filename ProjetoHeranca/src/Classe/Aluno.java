package Classe;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno() {

    }

    public Aluno(String nome) {
        setNome(nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    
}
