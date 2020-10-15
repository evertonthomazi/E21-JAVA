package funcionario;
import funcionario.Funcionario;
import java.util.Scanner;

public class Consulta {
    
    public static void main(String[] args) {
        Scanner scEntrada = new Scanner(System.in);
        Funcionario consultaFuncionario = new Funcionario();
        int opcaoAumento;
        
        System.out.print("Informe o nome do funcionário: ");
        consultaFuncionario.setNome(scEntrada.nextLine());
        
        System.out.print("Informe o departamento: ");
        consultaFuncionario.setDepartamento(scEntrada.nextLine());
        
        System.out.print("Informe o RG: ");
        consultaFuncionario.setRg(scEntrada.nextLine());
        
        System.out.print("Informe o salário: ");
        consultaFuncionario.setSalario(scEntrada.nextDouble());
        
        /*       System.out.print("Informe a data de entrada: ");
        consultaFuncionario.setDataEntrada(scEntrada.nextLine());*/
        
        System.out.println("Regitrar aumento para funcionário? ");
        System.out.println("0 para não | 1 para sim ");
        opcaoAumento = scEntrada.nextInt();
        
        if(opcaoAumento == 1) {
            System.out.println("Informe a quantia para acrescentar no salario ");
            consultaFuncionario.recebeAumento(scEntrada.nextDouble());
        } else {
            System.out.println("Ajuste finalizado");
        }
        
        System.out.println("RESUMO DA CONSULTA");
        System.out.println("==================");
        
        System.out.println("Funcionario: " + consultaFuncionario.getNome());
        System.out.println("Salário atual " + (consultaFuncionario.salario + consultaFuncionario.aumento));
                
    }
}
