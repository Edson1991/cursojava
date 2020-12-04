import java.util.Scanner;

public class testantoif{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1,n2,media;

        System.out.println("Digite a sua nota n1");
        n1 = teclado.nextDouble();
        System.out.println("Digite a sua nota n1");
        n2 = teclado.nextDouble();

        media = (n1+n2)/2;

        System.out.println("Média final: "+ media);

       if (media >= 7.0) {
           System.out.println(" Parabéns você foi APROVADO");
       }
       else {
           System.out.println(" Parabéns você se LASCOU");

       }

        System.out.println("***FIM DO PROGRAMA***");
    }
}