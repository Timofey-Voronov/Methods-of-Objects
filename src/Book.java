import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int yearBook;

    public Book(String title, Author author, int yearBook) {
        this.title = title;
        this.author = author;
        this.yearBook = yearBook;

    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook=yearBook;
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ", " + author + ", Год публикации: " + yearBook;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearBook == book.yearBook && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearBook);
    }

}
