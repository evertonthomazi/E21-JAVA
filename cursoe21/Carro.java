package cursoe21;

/**
 *
 * @author Proway
 */
public class Carro {
    private int anoAutomovel;
    private String modeloCarro;
    
    Carro (int anoAutomovel) {
        this.anoAutomovel = anoAutomovel;
    }
    
    Carro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
    
    Carro() {
    }
    
    Carro(int anoAutomovel, String modeloCarro) {
        this.anoAutomovel = anoAutomovel;
        this.modeloCarro = modeloCarro;
    }
    
    public void setAnoAutomovel(int anoAutomovel) {
        this.anoAutomovel = anoAutomovel;
    }
    
    public int getAnoAutomovel() {
        return this.anoAutomovel;
    }
    
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
    
    public String getModeloCarro() {
        return this.modeloCarro;
    }
}
