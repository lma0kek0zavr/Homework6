
public class App {
    public static void main(String[] args) throws Exception {

        Author JKRowling = new Author("Joanne", "Rowling");

        Author HPLovecraft = new Author("Howard", "Lovecraft");

        Book HarryPotter = new Book("Harry Potter and the Philosopher`s Stone", JKRowling, 1997);

        Book TheCallOfTheCthulhu = new Book("The call of the Cthulhu", HPLovecraft, 1928);

        HarryPotter.setYearOfPublication(2024);

        System.out.printf("\n%s \n%s \n%d", HarryPotter.getTitle(), HarryPotter.getAuthor(), HarryPotter.getYearOfPublication());

        System.out.print("\n--------------------------------");

        System.out.printf("\n%s \n%s \n%d", TheCallOfTheCthulhu.getTitle(), TheCallOfTheCthulhu.getAuthor(), TheCallOfTheCthulhu.getYearOfPublication());
    }
}
