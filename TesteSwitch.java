import java.util.Scanner;

public class TesteSwitch{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.println("Digite um valor inteiro");
        valor = teclado.nextInt();

        switch(valor){ // para o switch funcionar, o tipo da varialve precisa ser "inteiro, caractere ou string";
            case 1:
                System.out.println("Digitou o valor 1");
                break;
            case 2:
                System.out.println("Digitou o valor 2");
                break;
            case 3:
                System.out.println("Digitou o valor 3");
                break;
            default:
                System.out.println("Digitou outro valor");
                break;

        }

        System .out.println("***FIM DO PROGRAMA*****");
    }
}
