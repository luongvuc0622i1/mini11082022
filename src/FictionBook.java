public class FictionBook extends Book {
    private String category;

    public FictionBook() {
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
