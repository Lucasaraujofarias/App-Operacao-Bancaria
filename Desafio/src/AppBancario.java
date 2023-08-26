import java.util.Scanner;

public class AppBancario {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        String nome = "Lucas Araújo da costa Farias";
        String tipoConta = "Corrente";
        Double saldo = 2500.00;
        int opcao = 0;

        String dadosBancarios;
        dadosBancarios =
                """
                 ***************************************************
                 Dados do Cliente:
                            
                 Nome: %s
                 Tipo de conta: %s
                 Saldo da conta: R$ %.2f
                 ***************************************************            
                 """ .formatted(nome, tipoConta, saldo);
        //menu de opções
        String menuOpcoes;
        menuOpcoes  =
                """
                
                ** Oprações **                         
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                
                """;
        System.out.println(dadosBancarios);


        while(opcao != 4){
            System.out.println(menuOpcoes);
            System.out.println("Digite uma Opção: ");
            opcao = dados.nextInt();

            if(opcao == 1){
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = dados.nextDouble();
                if (valor > saldo){
                    System.out.println("Não a saldo para realizar a transferência !");
                } else{
                    saldo = saldo - valor;
                }
            }
            else if (opcao == 3){
                System.out.println("Qual o valor a receber: ");
                double receber =dados.nextDouble();
                saldo += receber;
            }
            else if (opcao != 4){
                System.out.println("Opção inválida !");

            }
            else if(opcao == 4){
                System.out.println("Operação finalizada com sucesso !");
            }
        }

    }
}
