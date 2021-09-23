public class ProgrammingBook extends Book{
    private String language;
    private int framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, int framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, int framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFramework(int framework) {
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public int getFramework() {
        return framework;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", language='" + language + '\'' +
                ", framework=" + framework +
                '}';
    }
}
