package exercíciobiblioteca;

import java.util.ArrayList;
import java.util.List;

import exerciciobiblioteca.CategoriaLivro;

public class Livro {

    private String titulo;
    private Autor autor;
    private CategoriaLivro categoria;
    private int quantidadeDisponivel;
    private List<Emprestimo> livrosEmprestados; // Track borrowed copies

    // Constructor with all attributes
    public Livro(String titulo, Autor autor, CategoriaLivro categoria, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.livrosEmprestados = new ArrayList<>(); // Initialize empty list
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public CategoriaLivro getCategoria() {
        return categoria;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public List<Emprestimo> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    // Methods for managing available quantity
    public void diminuiQuantidadeDisponivel() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
        } else {
            System.out.println("Não há cópias disponíveis desse livro.");
        }
    }

    public void aumentaQuantidadeDisponivel() {
        quantidadeDisponivel++;
    }

    // Add method to manage borrowed copies (replace getUsuario with relevant logic)
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        livrosEmprestados.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        livrosEmprestados.remove(emprestimo);
    }
}
