import app.Usuario;
import app.UsuarioService;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UsuarioService service = new UsuarioService();



        while (true){

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Buscar usuários por e-mail");
            System.out.println("3 - Listar usuários");
            System.out.println("4 - Remover usuários");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0 ){

                System.out.println("Encerrando...");
                break;
            }
            switch (opcao){

                case 1 -> {

                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    boolean cadastrado = service.cadastrarUsuario(
                            new Usuario(nome, email));

                    if (cadastrado){

                        System.out.println("Usuário cadastrado com sucesso!");

                    }
                    else {

                        System.out.println("Email ja cadastrado");
                    }

                }
                case 2 -> {

                    System.out.println("Email para busca: ");

                    String email = sc.nextLine();

                    Usuario usuario = service.buscarPorEmail(email);

                    if (usuario != null) {

                        System.out.println("Encontrado: " + usuario.getNome() + " - " + usuario.getEmail());
                    }
                    else {

                        System.out.println("Usuario não encontrado");
                    }

                }
                case 3 -> {
                    System.out.println("Usuários cadastrados");
                    service.listarUsuarios();

                }
                case 4 -> {
                    System.out.println("Digite o e-mail para remoção: ");
                    String email = sc.nextLine();

                    boolean remover = service.removerUsuario(email);

                    if(remover){

                        System.out.println("Usuário removido");
                    }
                    else {

                        System.out.println("Usuário não encontrado");
                    }

                }
                default -> System.out.println("opção inválida");
            }

        }



    }
}
