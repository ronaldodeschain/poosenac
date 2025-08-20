public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public String toString(){
        return "Pet: " + this.getNome() + " da raça: " + this.getEspecie() +
        " Idade: " + this.getIdade() + " Sexo: " + this.getSexo();
    }


}
