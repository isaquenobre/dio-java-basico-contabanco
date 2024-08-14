
/*
 * Sintaxe - Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

Revise sobre regras de declaração de variáveis

Atributo	Tipo	Exemplo
Numero	  Inteiro	 1021
Agencia	   Texto	 067-8
Nome Cliente Texto	MARIO ANDRADE
Saldo	  Decimal	 237.48


Revise sobre terminal, main args e a classe Scanner
Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
 */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da sua agencia!");
        String agencia = scanner.next();

        System.out.println("Agora, digite o numero da sua conta!");
        int conta = scanner.nextInt();

        System.out.println("Em seguida, digite o nome do titular!");
        String titular = scanner.next();

        System.out.println("O numero da seu saldo é:");
        double saldo = scanner.nextDouble();

        // imprimido os dados obtidos pelo usuario

        System.out.println(
                "Ola, cliente " + titular + "" + ",obrigado por abrir uma conta em nosso banco, sua agencia é "
                        + agencia
                        + "" + ",conta " + conta + " e seu saldo " + saldo + ", já está disponivel para saque.");

    }

}
