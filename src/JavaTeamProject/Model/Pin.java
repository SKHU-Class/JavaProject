package JavaTeamProject.Model;

public class Pin {
    public Pin(int index, Location location, String title, String imageUrl, String description) {
        this.index = index;
        this.location = location;
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
    }
    public int index;
    public Location location;
    public String title;
    public String imageUrl;
    public String description;
}
