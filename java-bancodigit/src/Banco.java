import java.util.ArrayList;
import java.util.List;

public class Banco {
    //atributos
    private String nome;
    private List<Conta> contasList;

    public Banco() {
        this.nome = nome;
        this.contasList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta nome){
        contasList.add(nome);
    }

}
