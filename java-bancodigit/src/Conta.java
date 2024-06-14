public abstract class Conta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    //contrutor, geterres

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    //métodos
    public void sacar(double valor){
        if (saldo == 0) {
            System.out.println("Não é possível sacar, seu saldo está zerado.");
        }else if(saldo < 0){
            System.out.println("Não é possível sacar, seu saldo é negativo.");
        }else {
            this.saldo -= valor;
            System.out.println("O valor do seu saldo agora é: " + this.saldo);
        }
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
        System.out.println("Agência: " + this.agencia);
        System.out.println("Numero: "+ this.numero) ;
        System.out.println("Saldo: " + this.saldo);
    }
}
