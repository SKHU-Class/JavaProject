package JavaTeamProject.Model;

public class Pin {
    public Pin(Location location, String title, String imageUrl, String description) {
        this.location = location;
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
    }
    public Location location;
    public String title;
    public String imageUrl;
    public String description;
}
