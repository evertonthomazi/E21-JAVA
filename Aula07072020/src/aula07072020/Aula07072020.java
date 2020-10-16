
package aula07072020;

import java.util.Scanner;

public class Aula07072020 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite o primeiro número");
        double v1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        double v2 = sc.nextDouble();
        System.out.println("Digite o terceiro número");
        double v3 = sc.nextDouble();
        double media = (v1+v2+v3)/3;
        System.out.println("Média dos valores é "+media);
        
    }
    
}
