package exercíciobiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private int numeroIdentificacao;
    private List<Livro> livrosEmprestados; 
    private boolean emBoasCondicoes; 
    
    public Usuario(String nome, int numeroIdentificacao) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.livrosEmprestados = new ArrayList<>(); 
        this.emBoasCondicoes = true; 
    }

    
    public String getNome() {
        return nome;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    
    public void adicionarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

   
    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }

   
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