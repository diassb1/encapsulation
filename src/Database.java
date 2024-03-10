import java.util.Arrays;

public class Database {
    User[] user = new User[10];
    Film[] film = new Film[10];


    public void addUser(User user) {
        for (int i = 0; i < this.user.length; i++) {
            validationUser(user);
            if (user.getBirthday() > 2024){
                System.out.println("Не правильно ввели дату рождения");
                return;
            }

            if (this.user[i] == null) {
                this.user[i] = user;
                return;
            }
        }
    }
    public void validationUser(User user){
        if (user.getName().equals("")){
            user.setName(user.getLogin());
        }
    }

    public void addFilm(Film film) {
        for (int i = 0; i < this.film.length; i++) {
            if (validationFilm(film)) {
                System.out.println("Не правильно ввели дату релиза или проджолжительность");
                return;
            }

            if (this.film[i] == null) {
                this.film[i] = film;
                return;
            }
        }
    }

    public boolean validationFilm(Film film) {
        if (film.getReleaseYear() < 1895 || film.getDuration() < 1) {
            return true;
        }
        return false;
    }

    public void displayUser() {
        for (User user : this.user) {
            if (user == null) {
                continue;
            }
            System.out.printf("""
                    ID: %s
                    Почта: %s
                    Логин: %s
                    Имя: %s
                    Дата рождения: %s
                    """.formatted(user.getId(), user.getEmail(), user.getLogin(), user.getName(), user.getBirthday()));
        }
    }

    public void displayFilm() {
        for (Film film : this.film) {
            if (film == null) {
                continue;
            }
            System.out.printf("""
                    ID: %s
                    Название фильма: %s
                    Описание фильма: %s
                    Дата релиза: %s
                    Продолжительность: %s
                    """.formatted(film.getId(), film.getName(), film.getDescription(), film.getReleaseYear(), film.getDuration()));
        }
    }
}
