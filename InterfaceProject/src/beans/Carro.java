package beans;

public class Carro extends Automovel implements interfaces.AutomovelInterface {
    
    @Override
    public String getTipoAutomovel() {
        return getTipoAutomovel() + "/" + getMarca() + "/" + getModelo();
    }
    public void setQtdeRodas() {
        
    }
    public void setTipoMotor() {
        
    }
}
