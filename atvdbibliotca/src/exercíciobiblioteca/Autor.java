package exercíciobiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private String nome;
    private List<Livro> livrosEscritos;
    private List<Livro> livrosEmprestados; 

 
    public Autor(String nome) {
        this.nome = nome;
        this.livrosEscritos = new ArrayList<>(); 
        this.livrosEmprestados = new ArrayList<>();
    }

    
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

   
    public void adicionarLivroEscrito(Livro livro) {
        livrosEscritos.add(livro);
    }

    
    public void adicionarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

   
    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}