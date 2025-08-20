public class Estoque{
    private int quantidade;
    private int codigoBarra;
    private String localizacao;
    private String categoria;

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setCodigoBarra(int codigoBarra){
        this.codigoBarra = codigoBarra;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public int getCodigoBarra(){
        return this.codigoBarra;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }
    public String getCategoria(){
        return this.categoria;
    }

}