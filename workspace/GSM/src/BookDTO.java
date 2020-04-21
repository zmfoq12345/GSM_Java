public class BookDTO {
    private String title;
    private String name;
    private int price;
    private int page;

    public BookDTO(){ };

    public BookDTO(String title, String name, int price, int page) {
        this.title = title;
        this.name = name;
        this.price = price;
        this.page = page;
    }

    public void setTitle(String title){ this.title = title; }
    public void setName(String name) { this.name = name; }
    public void setPrice(int price) { this.price = price; }
    public void setPage(int page) { this.page = page; }

    public String getTitle(){ return this.title; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getPage() { return page; }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", page=" + page +
                '}';
    }
}

