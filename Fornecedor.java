public class Fornecedor{
    private int cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String endereco;
    private String email;

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }


}