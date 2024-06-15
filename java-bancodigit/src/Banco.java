import java.util.ArrayList;
import java.util.List;

public class Banco {
    //atributos
    private String nome;
    private List<Conta> contasList;

    //contrutor e get
    public Banco() {
        this.nome = nome;
        this.contasList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    //métodos que são feitos no banco
    public void adicionarConta(String nome, double saldo) {
        Cliente novoCliente = new Cliente(nome);
        Conta novaConta = new Conta(saldo, novoCliente);
        contasList.add(novaConta);
    }

    public void removerConta(String nome){
        List<Conta> contasParaRemover = new ArrayList<>();
        if(!contasList.isEmpty()){
            for(Conta conta : contasList){
                if (conta.getCliente().getNome().equalsIgnoreCase(nome)){
                    contasParaRemover.add(conta);
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia");
        }
        contasList.removeAll(contasParaRemover);
    }

    public void mostrarContas(){
        System.out.println(contasList);
    }

    public void fazerPagamento(String nome, String nomeContaParaPagar, double pagamento){
        for(Conta conta : contasList){
            if(conta.getCliente().getNome().equalsIgnoreCase(nome)){
                conta.sacar(pagamento);
            }
        }
        for(Conta conta: contasList){
            if(conta.getCliente().getNome().equalsIgnoreCase(nomeContaParaPagar)){
                double valor = conta.getSaldo();
                conta.depositar(pagamento);
            }
        }
    }

    public void imprirExtratoBancario(String nome){
        for(Conta conta : contasList){
            if(conta.getCliente().getNome().equalsIgnoreCase(nome)){
                conta.imprimirExtrato();
            }
        }
    }


}
