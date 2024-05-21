package exercíciobiblioteca;

import java.util.ArrayList;
import java.util.List;

import exerciciobiblioteca.CategoriaLivro;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int quantidadeDisponivel;
    private List<Emprestimo> livrosEmprestados; 


    public Livro(String titulo, String autor, String categoria, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.livrosEmprestados = new ArrayList<>();
    }



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

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        livrosEmprestados.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        livrosEmprestados.remove(emprestimo);
    }
}