public class AlimentoPerecivel extends Alimento {
    protected String temperatura;
    protected String prazoAbertura;

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public void setPrazoAbertura(String prazoAbertura) {
        this.prazoAbertura = prazoAbertura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getPrazoAbertura() {
        return prazoAbertura;
    }

    
}
