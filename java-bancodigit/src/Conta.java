public class Conta {

    protected static int SEQUENCIAL = 1;
    //atributos
    protected int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    //contrutor, geterres

    public Conta(double saldo, Cliente cliente) {
        this.agencia = 1 ;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
        this.cliente = new Cliente(cliente.getNome());
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

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
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

    public String depositar(double valor){
        this.saldo += valor;
        return "o saldo ficou: " + this.saldo;
    }

    public void trasferir(double valor, Conta contaDestino){
        if(saldo == 0){
            System.out.println("Não tem commo transferir, sem saldo");
        }else if(saldo < 0){
            System.out.println("Saldo negativo, não pode transferir");
        }else if(saldo < valor){
            System.out.println("Saldo insuficente");
        }else{
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public void imprimirExtrato(){
        System.out.println("=== Imprimir Extrato ===");
        System.out.println("Agência: " + this.agencia);
        System.out.println("Numero: "+ this.numero) ;
        System.out.println("Saldo: " + this.saldo);
    }


}
