package exercíciobiblioteca;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<Autor> autores;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    
    public void adicionarLivro(Livro livro) throws Exception {
       if (livro == null) {
    	   throw new Exception("Nao e possivel adicionar um livro vazio");
       }
    	
    	this.livros.add(livro);
       
    }

    public boolean verificarDisponibilidadeLivro(Livro livro) {
        return livro.getQuantidadeDisponivel() > 0;
    }

    
    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

   
    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        if (verificarDisponibilidadeLivro(livro) && usuario.isEmBoasCondicoes()) {
            Emprestimo emprestimo = new Emprestimo(usuario, livro, LocalDate.now(), LocalDate.now().plusDays(14));
            emprestimos.add(emprestimo);
            livro.diminuiQuantidadeDisponivel();
            usuario.adicionarLivroEmprestado(livro);
            livro.getAutor().adicionarLivroEmprestado(livro);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Empréstimo não realizado. Verifique se o livro está disponível e se o usuário está em boas condições.");
        }
    }

    public void devolverLivro(Emprestimo emprestimo) {
        Livro livro = emprestimo.getLivro();
        livro.aumentaQuantidadeDisponivel();
        emprestimo.getUsuario().removerLivroEmprestado(livro);
        livro.getAutor().removerLivroEmprestado(livro);
        emprestimos.remove(emprestimo);
        System.out.println("Livro devolvido com sucesso!");
    }

    
    public List<Livro> obterListaLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (verificarDisponibilidadeLivro(livro)) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public List<Emprestimo> obterListaEmprestimosPendentes() {
        return emprestimos;
    }

    public void consultarInformacoesUsuario(Usuario usuario) {
        System.out.println("Informações do usuário:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Número de identificação: " + usuario.getNumeroIdentificacao());
        System.out.println("Livros emprestados:");
        for (Livro livro : usuario.getLivrosEmprestados()) {
            System.out.println("- " + livro.getTitulo());
        }
    }

    public void consultarInformacoesLivro(Livro livro) {
        System.out.println("Informações do livro:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Categoria: " + livro.getCategoria());
        System.out.println("Quantidade disponível: " + livro.getQuantidadeDisponivel());

        if (!livro.getLivrosEmprestados().isEmpty()) {
            System.out.println("Emprestado para:");
            for (Emprestimo emprestimo : livro.getLivrosEmprestados()) {
            	System.out.println("- " + emprestimo.getUsuario().getNome() + " (data de devolução prevista: " + emprestimo.getDataDevolucaoPrevista() + ")");
            }
        } else {
            System.out.println("O livro não está emprestado");
        }
    }

        public Livro buscarLivroPorTitulo(String tituloLivro) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
                    return livro;
                }
            }
            return null;
        }

        public Usuario buscarUsuarioPorNome(String nomeUsuario) {
            for (Usuario usuario : usuarios) {
                if (usuario.getNome().equalsIgnoreCase(nomeUsuario)) {
                    return usuario;
                }
            }
            return null;
        }


		public void imprimirLivros() {
			for (Livro livro : livros) {
			  System.out.println(livro.getTitulo());
			  System.out.println(livro.getAutor());
			  System.out.println(livro.getCategoria());
			  System.out.println(livro.getQuantidadeDisponivel());
			
			}

		}

			
		}





        