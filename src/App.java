import domain.model.Agencia;
import domain.model.Conta;
import domain.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        try {
            Agencia agencia = new Agencia();
            Pessoa pessoa = new Pessoa("Bia Silva", "bia@email.com", "+55 23 5644-45665");
            Conta conta = new Conta();

            Pessoa pessoa2 = new Pessoa("Carlos Silva", "33343434");

            agencia.nome = "Campo Grande";
            agencia.numero = "001";
            agencia.email = "campogrande@bankweb.com";
            agencia.tel = "+55 (21) 555-55555";

            pessoa.setCpf("111.222.444-99");
            // pessoa.setNome("");
            // pessoa.setTel("+55 (22) 4444-55555");
            // pessoa.setEmail("carladias@email.com");

            conta.numero = "100001";
            conta.agencia = agencia;
            conta.pessoa = pessoa;
            conta.saldo = 1000;

            System.out.println("Agencia : " + conta.agencia.nome);
            System.out.println("Cliente : " + conta.pessoa.getNome());
            System.out.println("Saldo   : " + conta.saldo);
            System.out.println("Pessoa 2   : " + pessoa2.getNome());
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }
}