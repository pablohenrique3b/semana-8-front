import java.util.ArrayList;
import java.util.List;

public class UserTracker {

    private List<String> users;

    // Construtor
    public UserTracker() {
        users = new ArrayList<>();
    }

    // Simula o componentDidMount
    public void componentDidMount() {
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        System.out.println("Componente montado!");
        showUsers();
    }

    // Simula o componentDidUpdate
    public void componentDidUpdate() {
        System.out.println("Usuários atualizados: " + users);
    }

    // Simula o componentWillUnmount
    public void componentWillUnmount() {
        users.clear();
        System.out.println("Componente desmontado. Dados limpos.");
    }

    // Exibe usuários
    public void showUsers() {
        System.out.println("Usuários Online:");

        for (String user : users) {
            System.out.println("- " + user);
        }
    }

    // Adiciona novo usuário
    public void addUser(String user) {
        users.add(user);
        componentDidUpdate();
    }

    // Método principal
    public static void main(String[] args) {

        UserTracker tracker = new UserTracker();

        // Monta o componente
        tracker.componentDidMount();

        System.out.println();

        // Atualiza lista
        tracker.addUser("Daniel");

        System.out.println();

        tracker.showUsers();

        System.out.println();

        // Desmonta componente
        tracker.componentWillUnmount();
    }
}
