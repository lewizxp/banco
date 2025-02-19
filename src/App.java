import domain.model.person;
import domain.model.Agencia;
import domain.model.conta;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    Agencia agencia = new Agencia();
    person  pessoa = new person();
    conta  Conta = new conta ();

agencia.nome = "Campo Grande";
agencia.numero = "555555";
agencia.tel = "66666666";
agencia.email= "agencia@gmail.com";

pessoa.nome="luiz";



    }
}
