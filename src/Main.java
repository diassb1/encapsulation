public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        User user = new User(1, "user@mail.ru", "userLogin", "", 2005);
        User user2 = new User(2, "user2@mail.ru", "user2Login", "nameUser2", 2024);
        database.addUser(user);
        database.addUser(user2);
        database.displayUser();

        Film film = new Film(1, " Фильм", "Описание фильма", 1990, 120);
        Film film2 = new Film(2, " Фильм 2", "Описание фильма 2", 1950, 120);
        database.addFilm(film);
        database.addFilm(film2);

        database.displayFilm();
    }
}
