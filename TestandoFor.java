public class TestandoFor{
    
    public static void main(String args[]){

        int valor;

        //valor += 10 .... --> valor = valor + 10
        //valor *= 2 ..... --> valor = valor * 2
        //valor++ ....     --> valor = valor + 1 
       // valor-- ....     --> valor = valor - 1

        for ( valor = 0; valor <= 10 ; valor = valor + 1 ){
            System.out.println("Valor = " + valor);
        }
    }
}
