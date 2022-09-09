public class ContactList {
  private String name;
  private char sex;
  private String email;
  private String phoneNumber;

  public void setNewContact(String name, char sex, String email, String phoneNumber) {
    this.name = name;
    this.sex = sex;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public String toString() {
   return "Contato: " + name + " - " + "Sexo: " + sex + " - " + "Email: " + email + " - " + "Numero: " + phoneNumber;
  }
}
