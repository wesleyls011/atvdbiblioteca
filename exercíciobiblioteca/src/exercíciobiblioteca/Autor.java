package exercíciobiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private String nome;
    private List<Livro> livrosEscritos;
    private List<Livro> livrosEmprestados; // Track borrowed books

    // Constructor with name attribute
    public Autor(String nome) {
        this.nome = nome;
        this.livrosEscritos = new ArrayList<>(); // Initialize empty lists
        this.livrosEmprestados = new ArrayList<>();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    // Method to add a written book
    public void adicionarLivroEscrito(Livro livro) {
        livrosEscritos.add(livro);
    }

    // Method to add a borrowed book
    public void adicionarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    // Method to remove a borrowed book
    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}
