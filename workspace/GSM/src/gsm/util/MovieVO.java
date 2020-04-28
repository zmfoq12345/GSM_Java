package gsm.util;

public class MovieVO {

    private String title;
    private String name;
    private int price;
    private int level;



    public MovieVO(String title, String name, int price, int level) {
        this.title = title;
        this.name = name;
        this.price = price;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", level=" + level +
                '}';
    }
}