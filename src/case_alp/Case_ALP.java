
package case_alp;

import java.util.Scanner;


public class Case_ALP {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        
        char grade = 'C';
        switch(grade) {
            case 'A' :
                System.out.println("Execelente!!");
                //break;
            case 'B' :
            case 'C' :
                System.out.println("Bem Feito!!");
                //break;
            case 'D' :
                System.out.println("Você passou!!");
            case 'E' :
                System.out.println("Melhor tentar novamente!!");
                //break;
            default :
                System.out.println("Conceito invalido");
                
        }
    }
    
}
