public class Cliente {
    //atributo
    private String nome;
    private String cpf;

    public Cliente() {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void verificarCpf(String cpf){
        if(cpf.length() == 8){
            this.cpf = cpf;
        }else{
            System.out.println("CPF inválido");
        }
    }
}
