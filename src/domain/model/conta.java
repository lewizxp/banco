package domain.model;

public class Conta {

    private double saldo;
    private String numero;
    private Agencia agencia;
    private Pessoa pessoa;


public Conta(Pessoa pessoa, String numero, Agencia agencia) throws Exception{
     this.saldo = 0;
     this.numero = numero;
     this.agencia = agencia;
     this.pessoa= pessoa;
    }
   
 public double getSaldo(){
  return saldo;



  //depoditar//
 }
   public void depositar(double valor) throws Exception{


 if(valor<=0 ){
    throw new Exception ("Valor de depósito inválido! o valor precisa ser maior que 0");

   }

  this.saldo += valor;
  System.out.println("Depósite de R$" + valor+ "realizado ccom sucesso") ;

   }

   //sacar//
   public void sacar(double valor) throws Exception{

    if(valor<=0){
     throw new Exception( "Valor de  saquei inválido! o valor precisa ser acima de 0");

    }

    if(this.saldo>valor){
        throw new Exception ("Saldo insuficiente");
    }

    this.saldo -= valor;
    System.out.println("Saque de R$" + valor + "realizado com sucesso");

   }
  
   //getters//
   public String getNumero(){
      return numero;
   }

    public Agencia getAgencia(){
        return agencia;
    }

    public Pessoa getPessoa(){
        return pessoa;
    }
}

