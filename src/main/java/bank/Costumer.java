package bank;

public class Costumer {
  private int id;
  private String name;
  private String username;
  private String password;
  private int accountId;

  public Costumer(int id, String name, String username, String password, int accountId) {
    setId(id);
    setName(name);
    setUsername(username);
    setPasswword(password);
    setAccountId(accountId);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPasswword() {
    return this.passwword;
  }

  public void setPasswword(String passwword) {
    this.passwword = passwword;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

}
