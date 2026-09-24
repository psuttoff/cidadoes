import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner leitura = new Scanner(System.in);

            Pessoa[] pessoas = new Pessoa[100];
            int quantidadePessoas = 0;

            System.out.println("==============");
            System.out.println("Seja bem-vindo(a) ao Sistema de consulta do cidadão (SCC)");
            System.out.println("==============");

            int opcao;

            do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("0 - Sair");

            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 1) {
                quantidadePessoas = cadastrar(
                        leitura,
                        pessoas,
                        quantidadePessoas
                );
            } else if (opcao == 2) {
                consultar(
                        leitura,
                        pessoas,
                        quantidadePessoas
                );
            }


            } while (opcao != 0);

            leitura.close(); }


        public static int cadastrar(
                Scanner leitura,
                Pessoa[] pessoas,
                int quantidadePessoas) {

            Pessoa pessoa = new Pessoa();

            System.out.println("Nome completo:");
            pessoa.nome = leitura.nextLine();

            System.out.println("CPF:");
            pessoa.cpf = leitura.nextLine();

            System.out.println("Dia de nascimento:");
            pessoa.diaNascimento = leitura.nextInt();

            System.out.println("Mês de nascimento:");
            pessoa.mesNascimento = leitura.nextInt();

            System.out.println("Ano de nascimento:");
            pessoa.anoNascimento = leitura.nextInt();

            leitura.nextLine();

            pessoas[quantidadePessoas] = pessoa;

            quantidadePessoas++;

            return quantidadePessoas;
        }


        public static void consultar(
                Scanner leitura,
                Pessoa[] pessoas,
                int quantidadePessoas) {

            System.out.println("Digite o CPF:");
            String cpf = leitura.nextLine();

        for (int i = 0; i < quantidadePessoas; i++) {

        if (pessoas[i].cpf.equals(cpf)) {

            System.out.println("==============");
            System.out.println("Cidadão encontrado");
            System.out.println("==============");

            System.out.println("Nome: " + pessoas[i].nome);
            System.out.println("CPF: " + pessoas[i].cpf);
            System.out.println("Data de nascimento: "
                    + pessoas[i].diaNascimento + "/"
                    + pessoas[i].mesNascimento + "/"
                    + pessoas[i].anoNascimento);

            return;
            }
        }

            System.out.println("Cidadão não encontrado.");
    }
}