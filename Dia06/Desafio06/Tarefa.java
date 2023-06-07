package Dia06.Desafio06;

public class Tarefa implements Comparable {
    private String titulo;
    private String descricao;
    private int identificador;
    private Prioridade prioridade = Prioridade.NENHUM;
    private boolean concluido = false;

    public Tarefa(String titulo, String descricao, Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Object o){
        Tarefa other = (Tarefa) o;
        return  other.prioridade.ordinal() - this.prioridade.ordinal();
    }

    @Override
    public String toString() {
        return "Tarefa(ID: " + identificador + "Nome: " + titulo + ", Descricao: " + descricao + ", Prioridade: " + prioridade.getPrioridade() + ')';
    }

    public String imprimir() {
        return String.format(
            "ID: " + identificador + "%n" + "Título: " + titulo + "%n" + "Prioridade: " + prioridade.getPrioridade() +
            "%n" + "Estado: " + ((concluido) ? "Concluído" : "Pendente") + "%n" + "Descrição: " + descricao + "%n"
        );
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public boolean isConcluido() {
        return this.concluido;
    }

    public boolean getConcluido() {
        return this.concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}
