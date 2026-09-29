package Entities;

public class AuthService {

    public UserRepository repository;

    public AuthService(UserRepository repository) {
        this.repository = repository;
    }

    public User register (String name, String email, String password) {
        if (repository.emailExists(email)) {
            System.out.println("Esse email já existe! ");
            return null;
        }
        User newUser = new User(name, email, password);
        repository.addUser(newUser);
        return newUser;
    }
    public User login (String email, String password) {
        User user = repository.findByEmail(email);

        if (user == null) {
            System.out.println("Usuario não encontrado! ");
            return null;
        }

        if (!user.checkPassword(password)) {
        System.out.println("Senha incorreta! ");
        return null;
        }
        return user;
    }
}