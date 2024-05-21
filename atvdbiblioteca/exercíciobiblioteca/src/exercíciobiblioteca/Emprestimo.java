package exercíciobiblioteca;

import java.time.LocalDate;

public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucaoPrevista;

    // Constructor with all attributes
    public Emprestimo(Usuario usuario, Livro livro, LocalDate dataRetirada, LocalDate dataDevolucaoPrevista) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataRetirada = dataRetirada;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    // Getters
    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }
}
