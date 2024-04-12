package exaula08;

public class Filmes {
    private String titulo, diretor, genero, pais;
    private int ano;

    public Filmes(String titulo, String diretor, String genero, String pais, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.pais = pais;
        this.ano = ano;
    }
    
    public String toString(){
        return "Título: " + titulo + ", Diretor: " + diretor + ", Gênero: " + genero + ", País: " + pais + ", Ano: " + ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
