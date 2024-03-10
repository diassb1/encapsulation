public class Film {
    private int id;
    private String name;
    private String description;
    private int releaseYear;
    private int duration;

    public Film(int id, String name, String description, int releaseYear, int duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDuration() {
        return duration;
    }

}
