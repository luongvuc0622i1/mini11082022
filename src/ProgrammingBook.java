public class ProgrammingBook extends Book {
    private String language;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language) {
        this.language = language;
    }

    public ProgrammingBook(String name, double price, String language) {
        super(name, price);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
