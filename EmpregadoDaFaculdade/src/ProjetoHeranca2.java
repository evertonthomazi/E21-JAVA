public class ProjetoHeranca2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funGerente = new Funcionario();
        
        funGerente.setNome("João");
        funGerente.setRg("56773892");
        funGerente.setDepto("COntas");
        funGerente.setDataEntrada("25/12/1999");
        funGerente.setSalario(8000);
        
        System.out.println("Salário antigo:" + funGerente.getSalario());
        System.out.println("Ganho Anual:" + funGerente.calculaGanhoAnual());
        funGerente.recebeAumento(800);
        System.out.println("Salário novo:" + funGerente.getSalario());
        System.out.println("Ganho Anual:" + funGerente.calculaGanhoAnual());
    }
    
}