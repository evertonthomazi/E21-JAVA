public class Funcionario {
    private String nome;
    private String rg;
    private String depto;
    private String dataEntrada;
    private double salario;
    
    public Funcionario(){}
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void recebeAumento(double valorAumento){
        salario += valorAumento;
    }
    
    public double calculaGanhoAnual(){
        return (getSalario() * 12);
    }
}