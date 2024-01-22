public class Feriados {
    private String nomeFeriado;
    private String dataFeriado;

    public Feriados(String nomeFeriado, String dataFeriado) {
        this.nomeFeriado = nomeFeriado;
        this.dataFeriado = dataFeriado;
    }

    public String getNomeFeriado(){
        return this.nomeFeriado;
    }
    public String getDataFeriado(){
        return this.dataFeriado;
    }
    public String getFeriado(){
        String feriado = this.dataFeriado + " => " + this.nomeFeriado;
        return feriado;
    }
}