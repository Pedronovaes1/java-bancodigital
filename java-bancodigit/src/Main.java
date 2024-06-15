public class Main {
    public static void main(String[] args) {
        //instânciando um novo banco
        Banco novoBanco = new Banco();

        //adicionando conta
        novoBanco.adicionarConta("Pedro", 1000);
        novoBanco.adicionarConta("Sabrina", 2000);
        novoBanco.adicionarConta("Davi", 3000);
        novoBanco.mostrarContas();

        //removendo conta
        novoBanco.removerConta("Pedro");
        novoBanco.mostrarContas();

        //fazendo pagamento
        novoBanco.fazerPagamento("Davi", "Sabrina", 100);
        novoBanco.mostrarContas();

        //imprimir Extrato
        novoBanco.imprirExtratoBancario("Davi");
        novoBanco.imprirExtratoBancario("Sabrina");
    }
}
