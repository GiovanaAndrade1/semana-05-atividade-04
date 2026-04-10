public class Time {
    private String nome;
    private String cidade;
    private int anoFundacao;
    private Tecnico tecnico;

    public Time() {
        this.nome = "";
        this.cidade = "";
        this.anoFundacao = 0;
        this.tecnico = new Tecnico();
    }

    public Time(String nome, String cidade, int anoFundacao) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
        this.tecnico = new Tecnico();
    }

    public Time(String nome, String cidade, int anoFundacao, Tecnico tecnico) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
        this.tecnico = tecnico;
    }

    public Time(Time outro) {
        this.nome = outro.getNome();
        this.cidade = outro.getCidade();
        this.anoFundacao = outro.getAnoFundacao();
        this.tecnico = new Tecnico();
        this.tecnico.copiar(outro.getTecnico());
    }

    public void copiar(Time outro) {
        this.nome = outro.getNome();
        this.cidade = outro.getCidade();
        this.anoFundacao = outro.getAnoFundacao();
        this.tecnico = new Tecnico();
        this.tecnico.copiar(outro.getTecnico());
    }

    public void escalarTecnico(Tecnico t) {
        this.tecnico = t;
    }

    @Override
    public String toString() {
        return "---- Time ----\n" +
               "Nome: " + this.nome + "\n" +
               "Cidade: " + this.cidade + "\n" +
               "Ano de Fundação: " + this.anoFundacao + "\n" +
               this.tecnico.toString();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public int getAnoFundacao() { return anoFundacao; }
    public void setAnoFundacao(int anoFundacao) { this.anoFundacao = anoFundacao; }
    public Tecnico getTecnico() { return tecnico; }
    public void setTecnico(Tecnico tecnico) { this.tecnico = tecnico; }
}
