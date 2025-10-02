import java.util.Objects;
public class NovoProduto {
    private String nomeDoProduto;
    private String codigoProduto;

    public NovoProduto(String nomeDoProduto, String codigoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.codigoProduto = codigoProduto;
    };
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof NovoProduto)) return false;

        NovoProduto novoProduto = (NovoProduto) o;

        return Objects.equals(nomeDoProduto, novoProduto.nomeDoProduto);
    }
    @Override
    public int hashCode() {
    return Objects.hash(codigoProduto);
    }

}
