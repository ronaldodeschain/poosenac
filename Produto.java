public class Produto{
    private String nomeProduto;
    private int unidade;
    private int codigoBarra;
    private String dataCompra;
    private String validade;

    
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getUnidade() {
        return unidade;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public String getValidade() {
        return validade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("nomeProduto=").append(nomeProduto);
        sb.append(", unidade=").append(unidade);
        sb.append(", codigoBarra=").append(codigoBarra);
        sb.append(", dataCompra=").append(dataCompra);
        sb.append(", validade=").append(validade);
        sb.append('}');
        return sb.toString();
    }


}