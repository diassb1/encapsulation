public class User {
     private int id;
     private String email;
     private String login;
     private String name;
     private int birthday;


    public User(int id, String email, String login, String name, int birthday) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

}
