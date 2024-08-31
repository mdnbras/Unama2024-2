package br.com.unama.domain;

public class Tarefa {

    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;
    private Categoria categoria;

    public Tarefa() {
    }

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.descricao = new String();
        this.prazo = "";
        this.prioridade = 0;
    }

    public Tarefa(String titulo, String descricao, String prazo, int propriedade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = propriedade;
    }

    public String exibirDetalhes() {
        return String.format("Titulo: %s\nDescricao: %s\nPrazo: %s\nPrioridade: %d", this.titulo, this.descricao, this.prazo, this.prioridade);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

