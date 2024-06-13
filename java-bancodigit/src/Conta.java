public abstract class Conta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //atributos
    protected int agencia;
    protected int numero;
    protected double saldo;

    //contrutor, geterres

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //métodos
    public void sacar(double valor){
        this.saldo -= valor;

    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void trasferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato(){
        System.out.println("=== Imprimir Extrato ===");
        System.out.println("Agância: " + this.agencia);
        System.out.println("Numero: "+ this.numero) ;
        System.out.println("Saldo: " + this.saldo);
    }
}
