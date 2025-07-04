public class Main {
    public static void main(String[] args) {

        Author name1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", name1, 1867);

        Author name2 = new Author("Алексей", "Толстой");
        Book book2 = new Book("Золотой ключик", name2, 1936);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.equals(book2));

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

    }
}