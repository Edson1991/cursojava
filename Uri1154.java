import java.util.Scanner;

public class Uri1154{
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade=0;
        int cont=0;
        double soma=0;
       
        while (true){
            idade = teclado.nextInt();
            if (idade < 0){
                break;
            }
            soma = soma + idade;
            cont++;            
        }
        System.out.printf("%.2f%n",soma/cont);
    }
}