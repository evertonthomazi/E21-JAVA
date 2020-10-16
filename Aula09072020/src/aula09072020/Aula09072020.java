
package aula09072020;

import java.util.Scanner;

public class Aula09072020 {

    public static void main(String[] args) {
        
        
        //----------------------Revisão------------------------
        
       /* String mensagemDeSaida;
        
        mensagemDeSaida = "Olá turma";          //Conceitos de Variáveis e classe System
        
        String outraMensagem;
        
        outraMensagem = mensagemDeSaida + ", tudo bem?";
        
        System.out.println(outraMensagem); */
        
        //-------------------------IF--------------------------
        
       /* Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite primeira nota");
        float n1 = teclado.nextFloat();
        
        System.out.println("Digite segunda nota");
        float n2 = teclado.nextFloat();
        
        float media = (float)((n1+n2)/2);                       //Conceito - ferrementas condicionais 
                                                                          //----IF/ELSE----- 
        if(media >= 7){
            
            System.out.println("Aluno Aprovado");
            System.out.println("Média atingida foi "+media);
            
        } else {
            
            System.out.println("Aluno Reprovado");
            System.out.println("Média atingida foi "+media);
            
        }  */
        
        //-------------------IF Encadiado------------------------
        
      /*  Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota");
        float n1 = sc.nextFloat();
        
        System.out.println("Digite a primeira nota");
        float n2 = sc.nextFloat();
        
        float media = (n1+n2)/2;
                                                               //Conceito - ferrementas condicionais
        if (media >= 7){                                                   //IF Encadeado
            
            System.out.println("Parabéns");
            
        } else {
            
            if(media >= 5){
                
                System.out.println("Recuperação");
                
            } else {
                
                System.out.println("Reprovado");
                
            }
        }  */
        
       //----------------------Teste Lógico-----------------------
       
       
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite primeira nota");
        float n1 = sc.nextFloat();
        
        System.out.println("Digite segunda nota");
        float n2 = sc.nextFloat();
        
        float media1 = (n1+n2)/2;
        
        System.out.println("Digite terceira nota");      //-----------Teste Lógico no IF----------
        float n3 = sc.nextFloat();                                  // && == AND or E
        
        System.out.println("Digite quarta nota");
        float n4 = sc.nextFloat();
        
        float media2 = (n3+n4)/2;
        
        if((media1 >= 7)&&(media2 >=7)){
            
            System.out.println("Passou!");
            
        } else {
            
            System.out.println("Reprovou!");
            
        }
        
       //-------------------------------------------------------
       
    }
    
}
