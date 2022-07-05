package poo1.pratica2;

public class Participante {

    private Integer numInscricao;
    private StatusInscricao statusInscricao;
    private Integer rg;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String celular;
    private String numEmergencia;
    private String grupoSanguineo;
    private Integer totalAPagar;

    public Participante() {
        this.statusInscricao = StatusInscricao.ATIVA;
    }

    public Integer getNumInscricao() {
        return numInscricao;
    }

    public void setNumInscricao(Integer numInscricao) {
        this.numInscricao = numInscricao;
    }

    public StatusInscricao getStatusInscricao() {
        return statusInscricao;
    }

    public void setStatusInscricao(StatusInscricao statusInscricao) {
        this.statusInscricao = statusInscricao;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumEmergencia() {
        return numEmergencia;
    }

    public void setNumEmergencia(String numEmergencia) {
        this.numEmergencia = numEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Integer getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(Integer totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "numInscricao=" + numInscricao +
                ", statusInscricao=" + statusInscricao +
                ", rg=" + rg +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", celular='" + celular + '\'' +
                ", numEmergencia='" + numEmergencia + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", totalAPagar=" + totalAPagar +
                '}';
    }
}
