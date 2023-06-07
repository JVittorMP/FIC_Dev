package Dia06.Desafio06;

public enum Prioridade {
    ALTA("Alta"), MEDIA("Media"), BAIXA("Baixa"), NENHUM("Nenhum");

    public String prioridade;

    Prioridade(String prioridade){
        this.prioridade = prioridade;
    }

    public String getPrioridade() {
        return this.prioridade;
    }
}
