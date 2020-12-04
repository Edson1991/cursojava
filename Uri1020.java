import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int Entrada, Ano ,Mes, Dia;

        //entrada - ler os valores

        Entrada = teclado.nextInt();

        //processamento - CALCULO
        Ano = Entrada / 365;
        Mes  = (Entrada % 365)/30;
        Dia = ((Entrada % 365) % 30);

        //saida - exibir o valor

        System.out.println(Ano + " ano(s)");
        System.out.println(Mes + " mes(es)");
        System.out.println(Dia + " dia(s)");
    }
}



