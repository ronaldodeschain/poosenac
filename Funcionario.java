public class Funcionario{
    private String nome;
    private int cpf;
    private String cargo;
    private double salario;
    private String endereco;
    private String dataContratacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

}