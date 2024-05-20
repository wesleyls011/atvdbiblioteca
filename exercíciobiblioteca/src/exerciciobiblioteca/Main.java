package exerciciobiblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

import exercíciobiblioteca.Biblioteca;
import exercíciobiblioteca.Livro;
import exercíciobiblioteca.Usuario;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao;
        do {
            exibirMenuPrincipal();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Limpar entrada inválida
                System.out.println("Opção inválida. Digite um número inteiro.");
                opcao = -1; // Opção inválida para voltar ao menu
            }

            switch (opcao) {
                case 1:
                    adicionarLivro(scanner, biblioteca);
                    break;
                case 2:
                    adicionarAutor(scanner, biblioteca);
                    break;
                case 3:
                    registrarUsuario(scanner, biblioteca);
                    break;
                case 4:
                    realizarEmprestimo(scanner, biblioteca);
                    break;
                case 5:
                    devolverLivro(scanner, biblioteca);
                    break;
                case 6:
                    listarLivrosDisponiveis(biblioteca);
                    break;
                case 7:
                    listarEmprestimosPendentes(biblioteca);
                    break;
                case 8:
                    consultarInformacoesUsuario(scanner, biblioteca);
                    break;
                case 9:
                    consultarInformacoesLivro(scanner, biblioteca);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void consultarInformacoesLivro(Scanner scanner, Biblioteca biblioteca) {
		// TODO Auto-generated method stub
		
	}

	private static void consultarInformacoesUsuario(Scanner scanner, Biblioteca biblioteca) {
		// TODO Auto-generated method stub
		
	}

	private static void listarEmprestimosPendentes(Biblioteca biblioteca) {
		// TODO Auto-generated method stub
		
	}

	private static void listarLivrosDisponiveis(Biblioteca biblioteca) {
		// TODO Auto-generated method stub
		
	}

	private static void devolverLivro(Scanner scanner, Biblioteca biblioteca) {
		// TODO Auto-generated method stub
		
	}

	private static void exibirMenuPrincipal() {
        System.out.println("\n\n---- Sistema de Gerenciamento de Biblioteca ----");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Adicionar Autor");
        System.out.println("3. Registrar Usuário");
        System.out.println("4. Realizar Empréstimo");
        System.out.println("5. Devolver Livro");
        System.out.println("6. Listar Livros Disponíveis");
        System.out.println("7. Listar Empréstimos Pendentes");
        System.out.println("8. Consultar Informações do Usuário");
        System.out.println("9. Consultar Informações do Livro");
        System.out.println("0. Sair");
        System.out.print("Digite a opção desejada: ");
    }

    private static void adicionarLivro(Scanner scanner, Biblioteca biblioteca) {
        // ... (existing implementation)
    }

    private static void adicionarAutor(Scanner scanner, Biblioteca biblioteca) {
        // ... (existing implementation)
    }

    private static void registrarUsuario(Scanner scanner, Biblioteca biblioteca) {
        // ... (existing implementation)
    }

    private static void realizarEmprestimo(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("\n---- Realizar Empréstimo ----");

        System.out.print("Título do livro: ");
        String tituloLivro = scanner.nextLine();

        Livro livro = biblioteca.buscarLivroPorTitulo(tituloLivro);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        System.out.print("Nome do usuário: ");
        String nomeUsuario = scanner.nextLine();

        Usuario usuario = biblioteca.buscarUsuarioPorNome(nomeUsuario);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        if (!biblioteca.verificarDisponibilidadeLivro(livro)) {
            System.out.println("Livro indisponível para empréstimo.");
            return;
        }

        if (!usuario.isEmBoasCondicoes()) {
            System.out.println("Usuário não está em boas condições para realizar empréstimo.");
            return;
        }

        biblioteca.realizarEmprestimo(usuario, livro);
        System.out.println("Empréstimo realizado com sucesso!");
    }
}
    
