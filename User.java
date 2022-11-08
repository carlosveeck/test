package carlos.veeck.newproject;

public class User {

    private long id;
    private String nome;
    private String cpf;


    public User(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
