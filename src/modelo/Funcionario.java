package modelo;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private String cpf;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, double salario, String cpf, String cargo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cargo=" + cargo + '}';
    }
    
}
