import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        /**
         * Simulando uma conta bancaria via Terminal/Console
         * 
         * @autor João Vinícius
         * @version 1.0
         * @since 28-05-2024
         */

        // Declarando variáveis
        int conta = 1021;
        String agencia = "067-8";
        String nomeCliente = "João Vinícius";
        Double saldo = 354.78;

        // Criando um objeto do tipo Scanner para receber os dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Recebendo os dados do cliente
        System.out.print("Digite o número da agencia: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        scanner.close();

        // Chamando método de validação dos dados recebidos e retornando ao cliente
        validarDados(numeroAgencia, agencia, numeroConta, conta, nomeCliente, saldo);

    }

    /**
     * 
     * @param numeroAgencia - número da agencia recebido pelo cliente através do
     *                      teclado
     * @param agencia       - número da agencia armazenado em variável
     * @param numeroConta   - número da conta recebido pelo cliente através do
     *                      teclado
     * @param conta         - número da conta armazenado em variável
     * @param nomeCliente   - nome do cliente armazenado em variável
     * @param saldo         - saldo do cliente armazenado em variável
     * @return este método retorna ao cliente uma mensagem de boas vindas, dados da
     *         conta e saldo caso os
     *         dados sejam verdadeiros, ou indica se são inválidos
     */
    public static void validarDados(String numeroAgencia, String agencia, int numeroConta, int conta,
            String nomeCliente, Double saldo) {
        if (numeroAgencia.equals(agencia) & numeroConta == conta) {
            System.out
                    .println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso Banco, sua agência é "
                            + agencia + ", conta " + conta + " e seu saldo R$:" + saldo
                            + " já está disponível para saque.");

        } else {
            System.out.println("Dados inválidos");
        }
    }
}
