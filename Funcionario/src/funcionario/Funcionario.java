package funcionario;

public class Funcionario {
    String nome;
    String departamento;
    String rg;
    double salario, aumento, calculoGanhoAnual;
    String dataEntrada;

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Funcionario() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    public void recebeAumento(double aumento) {
        this.aumento = aumento;
    }
    
    public double calculaGanhoAnual() {
        return calculoGanhoAnual;
    }
     
}
