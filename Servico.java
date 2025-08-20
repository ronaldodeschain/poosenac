public class Servico{
    private String nomeServico;
    private double valorServico;
    private int tempoEmMinutos;
    private String tipoServico;

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public void setTempoEmMinutos(int tempoEmMinutos) {
        this.tempoEmMinutos = tempoEmMinutos;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public int getTempoEmMinutos() {
        return tempoEmMinutos;
    }

    public String getTipoServico() {
        return tipoServico;
    }


}