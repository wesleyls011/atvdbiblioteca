package exercíciobiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private int numeroIdentificacao;
    private List<Livro> livrosEmprestados; // Track borrowed books
    private boolean emBoasCondicoes; // Flag for user status (can borrow)

    // Constructor with all attributes
    public Usuario(String nome, int numeroIdentificacao) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.livrosEmprestados = new ArrayList<>(); // Initialize empty list
        this.emBoasCondicoes = true; // Assume good condition initially
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    // Method to add a borrowed book
    public void adicionarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    // Method to remove a borrowed book
    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    // Method to check user status (replace with your implementation)
    public boolean isEmBoasCondicoes() {
        // Implement logic to check for conditions like overdue books or fines
        // Update emBoasCondicoes based on the check
        // Example (replace with your actual logic):
        // if (hasOverdueBooks() || hasFines()) {
        //     emBoasCondicoes = false;
        // }
        return emBoasCondicoes;
    }
}
