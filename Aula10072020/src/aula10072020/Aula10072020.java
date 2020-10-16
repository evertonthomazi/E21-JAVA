
package aula10072020;

import java.util.Scanner;

public class Aula10072020 {

    public static void main(String[] args) {
        
        //-----------------------IF SEM BLOCO------------------------
        
       /* String op = "sim";
        if(op == "sim") System.out.println("Olá Mundo");        //IF sem bloco executa apenas uma linha
        else System.out.println("Olá Turma"); */
        
        //--------------------------While-----------------------------
        
      /*  int contar = 0;
        
        while(contar < 10){
            
            contar++;
            System.out.println("Andar");                        //While = Enquanto: é usado para repetir
                                                                // em loop até a condição não ser mais 
        }      */                                               // verdadeira. depois disso o loop é encerrado
        
      /*  int contar2 = 0;
        
        while(contar2 < 10){
            
            contar2++;
            
            if(contar2 > 3){
                
            System.out.println("Andar");                         
                                                                 
            }                                                    
        }  */
      
     /*   int op = 0;
      
        Scanner sc = new Scanner(System.in);
      
        System.out.println("------Menu------");
        System.out.println("1- Cadastrar");
        System.out.println("2- Consultar");
        System.out.println("3- Pesquisar");
        System.out.println("4- Remover");
        System.out.println("5- Alterar");
        System.out.println("----------------");
                                                               
        System.out.println(" ");
        System.out.println("Digite uma opção");
        op = sc.nextInt();
        
        while((op >= 1) && (op <= 5)){
            
        System.out.println("Comando Válido");
        op = sc.nextInt();
        
      }
      
      System.out.println("Comando inválido"); */
        
        //-------------------------------------------------------------
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número total de elementos: ");
        int elementos = sc.nextInt();
        int cont = 1;
        double total = 0;
        double valor;
        
        while(cont <= elementos){
            cont++;
            System.out.println("Digite o valor:");
            
            valor = sc.nextFloat();
            total += valor;
            
        }
        
        double media = total/elementos;
        System.out.println("Média é igual: "+media);
        
    }
    
}
