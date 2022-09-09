import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<ContactList> allContacts = new ArrayList<>();

        boolean useState = true;

        while (useState) {
            System.out.println("Bem a sua Agenda de Contato \n");
            System.out.println("Escolha as funcionalidades \n");
            String userChoice = System.console()
                    .readLine("\n 1 - Cadastrar \n 2 - Editar \n 3 - Excluir \n 4 - Consultar Agenda \n 5 - Sair \n \n");

            System.out.println("Carregando... \n");

            switch (userChoice) {
                case "1":
                    System.out.println("Cadastre um novo usuario \n");

                    ContactList Contact = new ContactList();
                    Contact.setNewContact(System.console().readLine("Nome da pessoa: \n"), System.console()
                            .readLine("Sexo do contato: M para masculino e F para feminino \n").charAt(0),
                            System.console().readLine("numero \n"), System.console().readLine("Email \n"));

                    allContacts.add(Contact);

                    System.out.println("Usuario Cadastrado com sucesso \n");
                    break;
                case "2":
                    for (int i = 0; i < allContacts.size(); i++) {
                        System.out.println("Numero do contato: " + (i + 1));
                        System.out.println(allContacts.get(i));
                        System.out.println("\n");
                    }

                    allContacts.remove(
                            Integer.parseInt(System.console().readLine("Qual Contato você deseja editar ?")) - 1);

                    ContactList ContactEdit = new ContactList();

                    ContactEdit.setNewContact(System.console().readLine("Nome da pessoa: \n"), System.console()
                            .readLine("Sexo do contato: M para masculino e F para feminino \n").charAt(0),
                            System.console().readLine("numero \n"), System.console().readLine("Email \n"));

                    allContacts.add(ContactEdit);

                    System.out.println("Usuario Editado com sucesso \n");

                    break;
                case "3":
                    for (int i = 0; i < allContacts.size(); i++) {
                        System.out.println("Numero do contato: " + (i + 1));
                        System.out.println(allContacts.get(i));
                        System.out.println("\n");
                    }

                    allContacts.remove(
                            Integer.parseInt(System.console().readLine("Qual contato você deseja remover?")) - 1);
                    break;
                case "4":
                    System.out.println("Todos os seus contatos \n");

                    for (int i = 0; i < allContacts.size(); i++) {
                        System.out.println("Numero do contato: " + (i + 1));
                        System.out.println(allContacts.get(i));
                        System.out.println("\n");
                    }

                    break;
                case "5":
                    System.out.println("Saindo... \n");
                    useState = false;
                    break;
                default:
                    System.out.println("Opção invalida... \n");
                    break;
            }

            break;
        }
    }
}
