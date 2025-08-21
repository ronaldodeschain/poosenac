public class LixoOrganico extends Lixo {
    protected String tempoDeComposicao;
    protected String aterro;
    protected String compostagem;

    public void setTempoDeComposicao(String tempoDeComposicao) {
        this.tempoDeComposicao = tempoDeComposicao;
    }

    public void setAterro(String aterro) {
        this.aterro = aterro;
    }

    public void setCompostagem(String compostagem) {
        this.compostagem = compostagem;
    }

    public String getTempoDeComposicao() {
        return tempoDeComposicao;
    }

    public String getAterro() {
        return aterro;
    }

    public String getCompostagem() {
        return compostagem;
    }


}
