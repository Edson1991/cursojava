import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int Entrada, Hora ,Min, Seg;

        //entrada - ler os valores

        Entrada = teclado.nextInt();

        //processamento - CALCULO
        Hora = Entrada / 3600;
        Min  = (Entrada % 3600)/60;
        Seg = ((Entrada % 3600) % 60);

        //saida - exibir o valor

        System.out.print(Hora + ":");
        System.out.print(Min + ":");
        System.out.println(Seg);
     }
}
