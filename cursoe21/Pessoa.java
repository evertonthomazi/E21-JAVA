
package cursoe21;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    private String voz;
    private String falar;
    private int idade;
    private String sexo;
    
    Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    Pessoa(String nome) {
        this.nome = nome;
    }
    
    Pessoa(int idade) {
        this.idade = idade;
    }
    
    Pessoa() {
        
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
  
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setVoz(String voz) {
        this.voz = voz;
    }
    
    public String getVoz() {
        return this.voz;
    }
    
    public void setFalar(String falar) {
        this.falar = falar;
    }
    
    public String getFalar() {
        return this.falar;
    }
    
    /**
     * 06/10/2020
     */
    
    /**
     * 
     * @param idade 
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getSexo() {
        return this.sexo;
    }
}
