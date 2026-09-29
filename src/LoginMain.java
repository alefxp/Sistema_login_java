import Entities.AuthService;
import Entities.User;
import Entities.UserRepository;

import java.util.Locale;
import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" == Sistema de login== ");
        UserRepository repository = new UserRepository();
        AuthService authService = new AuthService(repository);

        while (true) {
            System.out.println("1 - CADASTRO ");
            System.out.println("2 - LOGIN ");
            System.out.println("3 - SAIR ");
            System.out.print(" Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("NOME: ");
                String name = sc.nextLine();
                System.out.print("EMAIL: ");
                String email = sc.nextLine();
                System.out.print("SENHA: ");
                String password = sc.nextLine();

                User novoUser = authService.register(name, email, password);
                if (novoUser != null) {
                    System.out.println("Cadastro completo! ");
                }
            }
            else if (opcao == 2) {
                System.out.print("EMAIL: ");
                String email = sc.nextLine();
                System.out.print("SENHA: ");
                String password = sc.nextLine();
                User user = authService.login(email, password);
                if (user != null) {
                    System.out.println("Bem vindo, " + user.getName() + "!");
                }
            }
            else if (opcao == 3) {
                System.out.println("Programa finalizado");
                break;
            }
        }
    }
}
