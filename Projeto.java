import java.util.Scanner;

public class ProjetoPagamento {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");


        String nome = leitura.next();
        System.out.println("Qual o seu sobrenome? ");
        String sobrenome = leitura.next();
        System.out.println("Qual a sua conta?");
        String Tipo_Conta = leitura.next();
        System.out.println("Qual é seu saldo? ");
        float saldo = leitura.nextFloat();


        System.out.println("****************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("nome: "+ nome +" "+ sobrenome );
        System.out.println("Tipo conta: "+ Tipo_Conta);
        System.out.println(("Saldo inicial: "+"R$"+saldo));
        System.out.println("****************************");
        System.out.println("Operações");
        System.out.println("1 - Colsultar saldos");
        System.out.println("2 - receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");


        int protocolo = leitura.nextInt();

        while(protocolo != 4) {

            if (protocolo == 1){

                System.out.println("Saldo: "+saldo);

            }
                if (protocolo == 2){
                    System.out.println("Digite o valor a receber? ");
                    int valor_recebido = leitura.nextInt();

                  valor_recebido += saldo;

                    System.out.println("Saldo recebido R$:"+valor_recebido);

                }
                    if (protocolo == 3){
                        System.out.println("Quanto deseja transferir?" );
                        int valor_transferir = leitura.nextInt();

                        float resultado = saldo - valor_transferir;

                        System.out.println("Saldo atual: "+resultado);
                    }
                    break;






    }
    }
}
